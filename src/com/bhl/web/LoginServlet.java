package com.bhl.web;

import com.bhl.models.User;
import com.bhl.service.IUserService;
import org.omg.CORBA.UserException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        //1.获取请求参数
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        //2.调用业务方法（login）
        IUserService userService = new IUserServiceImpl();

        User pageUser = new User(username,password,null,null);
        User formuser = new User();
        user = userService.login(pageUser);
        request.getSession().setAttribute("loginUsername",user.getUsername());
        response.getWriter().write();

    }


}
