package com.bhl.com.bhl.lesson02;

import com.bhl.models.User;
import com.bhl.utils.DButils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class Demo01 {
    @Test
    public  void test4(){
        Connection conn = null;
        Statement stmt = null;
        ResultSet resultSet = null;
        try {
            conn = DButils.getConnection();
            stmt = conn.createStatement();
            resultSet = stmt.executeQuery("select * from user;");
            List<User> list = new ArrayList<User>();
            while (resultSet.next()){
                User user = new User();
                
                user.setId(resultSet.getInt("id"));
                user.setUsername(resultSet.getString("username"));
                user.setPassword(resultSet.getString(3));
                user.setEmail(resultSet.getString(4));
                user.setBirthday(resultSet.getDate(5));

                list.add(user);
            }
            System.out.println(list);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DButils.clossAll(conn,stmt,null);
        }

    }
}
