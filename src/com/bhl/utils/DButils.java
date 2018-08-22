package com.bhl.utils;

import java.sql.*;

public class DButils {
    private static String url = "jdbc:mysql://localhost/test";
    private static String user = "test";
    private static String password = "test123";
    private static String driverClass = "com.mysql.jdbc.Driver";

    static {
        try {
            Class.forName(driverClass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
    public static Connection getConnection() throws Exception {
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
