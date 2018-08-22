package com.bhl.service;

import com.bhl.models.User;
import com.bhl.utils.DButils;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserService {

    public User finderUser(String username, String password) {
        User user = null;
        Connection conn = null;
        Statement stmt = null;
        ResultSet resultSet = null;

        try {
            conn = DButils.getConnection();
            stmt = conn.createStatement();
            String sql = "select * from user where username = '" + username + "' and password='" + password + "';";
            resultSet = stmt.executeQuery(sql);
            while(resultSet.next()){
                user = new User();
                user.setId(resultSet.getInt(1));
                user.setUsername(resultSet.getString(2));
                user.setPassword(resultSet.getString(3));
                user.setEmail(resultSet.getString(4));
                user.setBirthday(resultSet.getDate(5));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DButils.clossAll(conn,stmt,null);
        }

        return user;
    }
}

