package com.bhl.dao;

import com.bhl.models.User;

public interface IUserDao {
    /**
     * 插入数据
     * @param user
     */
    public  void insert(User user);

    /**
     * 通过用户名和密码查找用户
     * @param username
     * @param password
     * @return
     */
    public  User findUser(String username, String password);

    /**
     * 通过用户名查询用户
     * @param username
     * @return
     */
    public User findUser(String username);
}
