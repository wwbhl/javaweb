package com.bhl.service;

import com.bhl.models.User;
import org.omg.CORBA.UserException;

public interface IUserService {
    public void register(User user);
    public User login(String username, String password);
    public User login(User user) throws UserException;
    public User userExsit(User user);
}
