package com.bhl.com.bhl.lesson01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo03 {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql:///test?user=test&password=test123");
        Statement statement = conn.createStatement();
        String sql = "select * from user;";
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()){
            System.out.println(resultSet.getObject(1));
            System.out.println(resultSet.getObject(2));
            System.out.println(resultSet.getObject(3));
            System.out.println(resultSet.getObject(4));
            System.out.println(resultSet.getObject(5));
            System.out.println("=====================");
        }
        resultSet.close();
        statement.close();
        conn.close();
    }
}
