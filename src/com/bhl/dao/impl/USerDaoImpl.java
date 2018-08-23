package com.bhl.dao.impl;

import com.bhl.dao.IUserDao;
import com.bhl.models.User;
import com.bhl.utils.DButils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Date

public class USerDaoImpl implements IUserDao {
    @Override
    public void insert(User user) {
        Connection conn = null;
        PreparedStatement ps = null;

        //写 JDBC 代码
        try {
            //1.注册驱动
            //2.获取 connection 对象
            conn = DButils.getConnection();
            //3.获取 Statement 对象
            String sql = "insert into t_user (username, password, email, birthday) values(?,?,?,?)";
            ps = conn.prepareStatement(sql);
            //设置参数
            ps.setString(1,user.getUsername());
            ps.setString(2,user.getPassword());
            ps.setString(3,user.getEmail());
            //user.getBirthday();//util.date
            ps.setDate(4,new java.sql.Date(user.getBirthday().getTime()));
            //4.执行 sql 语句 delete/update/insert
            int r = ps.executeUpdate();
            System.out.println("受影响的结果行数："+ r);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DButils.clossAll(conn,ps,null);

        }
    }

    @Override
    public User findUser(String username, String password) {
        User user = null;
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            conn = DButils.getConnection();
            String sql = "select * from t_user where username = ? and password = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1,username);
            ps.setString(2,password);
            rs = ps.executeQuery();

            while(rs.next()){
                user = new User();
                user.setId(rs.getInt("id"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setEmail(rs.getString("id"));
                user.setBirthday(rs.getDate("id"));

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DButils.clossAll(conn,ps,rs);
        }
        return user;
    }

    @Override
    public User findUser(String username) {
        User user = null;
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        //
        try {
            conn = DButils.getConnection();

            String sql = "select * from t_user where username = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1,username);
            rs = ps.executeQuery();

            while (rs.next()){
                user = new User();
                user.setId(rs.getInt("id"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setEmail(rs.getString("email"));
                user.setBirthday(rs.getDate("birthday"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DButils.clossAll(conn,ps,rs);
        }
        return user;
    }
}
