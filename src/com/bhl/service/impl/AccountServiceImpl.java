package com.bhl.service.impl;

import com.bhl.dao.IAccountDao;
import com.bhl.dao.impl.AccountDaoImpl;
import com.bhl.models.Account;
import com.bhl.service.IAccountService;
import com.bhl.utils.ManagerThreadLocal;

import java.sql.SQLException;

public class AccountServiceImpl implements IAccountService {
    @Override
    public void transfer(String from, String to, double amount) {
        IAccountDao accountDao = new AccountDaoImpl();
        try {
            accountDao.updateAccount(from , to, amount);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void transfer1(String from, String to, double amount) {
        try {
            ManagerThreadLocal.beginTransaction();
            IAccountDao accountDao = new AccountDaoImpl();
            Account fromAccount = accountDao.findAccount(from);
            Account toAccount = accountDao.findAccount(to);
            System.out.println("转账前。。。。");
            System.out.println("from:"+fromAccount);
            System.out.println("to:"+toAccount);
            System.out.println("转账后....");
            fromAccount.setMoney(fromAccount.getMoney()-amount);
            toAccount.setMoney(toAccount.getMoney()+amount);
            System.out.println("from"+fromAccount);
            System.out.println("to:"+toAccount);

            accountDao.updateAccount(fromAccount);
            accountDao.updateAccount(toAccount);

            ManagerThreadLocal.commitTransaction();
        } catch (SQLException e) {
            e.printStackTrace();
            ManagerThreadLocal.rollbackTransaction();
        }finally {
            ManagerThreadLocal.close();
        }
    }
}
