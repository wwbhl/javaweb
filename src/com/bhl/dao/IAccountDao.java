package com.bhl.dao;

import com.bhl.models.Account;

import java.sql.SQLException;

public interface IAccountDao {
    /**
     * 更新账户信息
     * @param from 输出的帐号
     * @param to 输入的帐号
     * @param amount 转账的金额
     */
    public void updateAccount(String from,String to,double amount) throws SQLException;
    /**
     * 根据名字查找账号信息
     */
    public Account findAccount(String name) throws SQLException;
    public void updateAccount(Account account) throws SQLException;
}
