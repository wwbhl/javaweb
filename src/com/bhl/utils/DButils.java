package com.bhl.utils;

import java.sql.*;
import java.util.ResourceBundle;

public class DButils {
    private static String url = null;// "jdbc:mysql://localhost/test";
    private static String user = null;//"test";
    private static String password = null;//"test123";
    private static String driverClass = null;//"com.mysql.jdbc.Driver";

    static {
        try {
            ResourceBundle rb = ResourceBundle.getBundle("db");
            url = rb.getString("url");
            user = rb.getString("user");
            password = rb.getString("password");
            driverClass = rb.getString("driverClass");

            System.out.println();
            Class.forName(driverClass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url,user,password);
    }
    public static void clossAll(Connection conn, Statement statement, ResultSet resultSet){
        if(resultSet != null){
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(conn != null){
            try{
                conn.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
}
