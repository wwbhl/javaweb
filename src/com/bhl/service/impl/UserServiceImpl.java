package com.bhl.service.impl;

import com.bhl.dao.IUserDao;
import com.bhl.dao.impl.USerDaoImpl;
import com.bhl.models.User;
import com.bhl.service.IUserService;
import org.omg.CORBA.UserException;

public class UserServiceImpl implements IUserService {
    private IUserDao userDao = new USerDaoImpl();

    @Override
    public void register(User user) {

    }

    @Override
    public User login(String username, String password) {
        return null;
    }

    @Override
    public User login(User user) throws UserException {
        return null;
    }

    @Override
    public User userExsit(User user) {
        return null;
    }
}
