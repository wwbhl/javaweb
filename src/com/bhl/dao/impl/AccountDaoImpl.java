package com.bhl.dao.impl;

import com.bhl.dao.IAccountDao;
import com.bhl.models.Account;
import com.bhl.utils.C3P0Utils;
import com.bhl.utils.ManagerThreadLocal;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

public class AccountDaoImpl implements IAccountDao {
    @Override
    public void updateAccount(String from, String to, double amount) throws SQLException {
        QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
        qr.update("update account set money=money-? where name = ?",amount,from);
        qr.update("update account set money=money+? where name= ?",amount,to);
    }

    @Override
    public Account findAccount(String name) throws SQLException {
        QueryRunner qr = new QueryRunner();
        String sql = "select * from account where name = ?";
        Account account = qr.query(ManagerThreadLocal.getConnection(),sql,new BeanHandler<Account>(Account.class),name);
        return account;
    }

    @Override
    public void updateAccount(Account account) throws SQLException {
        QueryRunner qr = new QueryRunner();
        qr.update(ManagerThreadLocal.getConnection(),"update account set money = ? where id = ?",account.getMoney(),account.getId());

    }
}
