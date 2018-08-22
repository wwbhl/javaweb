package com.bhl.com.bhl.lesson02;

import com.bhl.models.User;
import com.bhl.service.UserService;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String name = scanner.nextLine();
        System.out.println("请输入密码：");
        String password = scanner.nextLine();

        UserService service = new UserService();
        User user = service.finderUser(name,password);
        if(user != null){
            System.out.println("登录成功");
        }else {
            System.out.println("登录失败，用户名或者密码不正确");
        }
        scanner.close();
    }


}
