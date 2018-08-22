package com.bhl.com.bhl.lesson01;

import java.sql.*;

public class Demo04 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql:///test?user=test&password=test123");
            statement = conn.createStatement();
            String sql = "select * from user;";
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                System.out.println(resultSet.getObject(1));
                System.out.println(resultSet.getObject(2));
                System.out.println(resultSet.getObject(3));
                System.out.println(resultSet.getObject(4));
                System.out.println(resultSet.getObject(5));
                System.out.println("=====================");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
