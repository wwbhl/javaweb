package com.bhl.service.impl;

import com.bhl.dao.IUserDao;
import com.bhl.dao.impl.USerDaoImpl;
import com.bhl.exception.UserException;
import com.bhl.models.User;
import com.bhl.service.IUserService;


public class UserServiceImpl implements IUserService {
    private IUserDao userDao = new USerDaoImpl();

    @Override
    public void register(User user) {
        userDao.insert(user);
    }

    @Override
    public User login(String username, String password) {
        return userDao.findUser(username,password);
    }

    @Override
    public User login(User user) throws UserException {
        User u =userDao.findUser(user.getUsername(), user.getPassword());
        if(u != null){
            return u;
        }else{
            throw new UserException("用户名和密码不正确");
        }
        //return userDao.findUser(username);
    }

    @Override
    public boolean userExsit(String username) {
        User user = userDao.findUser(username);
        return user != null;
    }
}
