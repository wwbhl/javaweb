package com.bhl.service;

public interface IAccountService {
    /**
     * 转账操作
     * @param from
     * @param to
     * @param amount
     */
    public void transfer(String from, String to, double amount);
    public void transfer1(String from, String to, double amount);

}
