package com.bhl.com.bhl.lesson01;

import com.bhl.utils.DButils;

import java.sql.*;

public class Demo05 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {

            conn = DButils.getConnection();
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
            DButils.clossAll(conn,statement,resultSet);

        }

    }
}
