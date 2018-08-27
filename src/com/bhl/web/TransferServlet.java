package com.bhl.web;

import com.bhl.service.IAccountService;
import com.bhl.service.impl.AccountServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "TransferServlet",urlPatterns = {"/TransferServlet"})
public class TransferServlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println(Thread.currentThread());
        IAccountService accountService = new AccountServiceImpl();
        accountService.transfer1("aaa","bbb",100);
    }
}
