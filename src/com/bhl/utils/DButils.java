package com.bhl.utils;

import java.sql.*;
import java.util.ResourceBundle;

public class DButils {
    private static String url = null;
    private static String user = null;
    private static String password = null;
    private static String driverClass = null;

    static {
        try {
            //从 db.properites 取数据赋值给静态变量

            /**
             * 以前使用 Properties 类来读.properties 文件的内容
             *
             * 使用 ResourceBundle 资源文件夹
             *
             */
            ResourceBundle rb = ResourceBundle.getBundle("db");//不需要写后缀名
            url = rb.getString("url");
            user = rb.getString("user");
            password = rb.getString("password");
            driverClass = rb.getString("driverClass");

            System.out.println("从 db.properites 取数据：");
            System.out.println("url:"+ url);
            System.out.println("user:"+user);
            System.out.println("password"+password);
            System.out.println("driverClass"+driverClass);
            Class.forName(driverClass);//加载驱动
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
