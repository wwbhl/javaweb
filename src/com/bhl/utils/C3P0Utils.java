package com.bhl.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class C3P0Utils {
    /**
     * 使用了连接池后，使用数据源来获取连接
     * 数据源，也就是连接池
     */
    private static DataSource ds = new ComboPooledDataSource();

    public static DataSource getDs() {
        return ds;
    }
    public static Connection getConnection(){
        try {
            return ds.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();//如果用 throw 抛出异常，不需要写返回值

//            throw new RuntimeException("服务器错误");
        }

        return null;//用 e.printStackTrace()只是打印错误提示，但程序还会继续执行，因为方法为带返回值的，所以返回 null 否则报错。
    }
    public static void closeAll(Connection conn, Statement statement, ResultSet resultSet){
        if(resultSet != null){
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            statement = null;

        }
        if(conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
                conn = null;
            }

        }
    }
}
