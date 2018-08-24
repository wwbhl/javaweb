package com.bhl.service;

import com.bhl.models.User;
import com.bhl.exception.UserException;

public interface IUserService {
    /**
     * 注册业务
     * @param user
     */
    public void register(User user);

    /**
     * 登录业务
     * @param username
     * @param password
     * @return
     */
    public User login(String username, String password);

    /**
     * 登录业务2
     * @param user
     * @return
     * @throws UserException
     */
    public User login(User user) throws UserException;

    /**
     * 判断用户是否存在
     * @param user
     * @return
     */
    public boolean userExsit(String user);
}
