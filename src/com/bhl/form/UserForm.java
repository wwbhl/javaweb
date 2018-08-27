package com.bhl.form;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

public class UserForm {
    private String username;
    private String password;
    private String repassword;
    private String email;
    private String birthday;
    //调用方法进行校验
    public boolean validate(){
        //username.trim()去除左右空格
        if(username == null || username.trim().length() == 0){
            err.put("username", "用户名不能为空");
        }
        //w:[A-Za-z0-9]
        if(!username.matches("\\w{5,15}")){
            err.put("username","用户名长度5~15");
        }
        //密码不能为空
        if(password == null || password.trim().length() == 0){
            err.put("password","密码不能为空");
        }
        if(!password.matches("\\w{6,9}")){
            err.put("password","密码长度6~9");
        }
        //确认密码要与前面的密码一致
        if(!password.equals(repassword)){
            err.put("repassword","确认密码要与前面的密码一致");
        }
        //邮箱的格式要正确
        if(email == null || email.trim().length() == 0){
            err.put("email","邮箱不能为空");
        }
        if(!email.matches("^\\w+((-\\w+)|(\\.\\w+))*\\@[A-Za-z0-9]+((\\.|-)[A-Za-z0-9]+)")){
            err.put("email","邮箱格式不正确");
        }
        //日期的格式也要正确
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            sdf.parse(birthday);
        } catch (ParseException e) {
            err.put("birthday","日期的格式为 xxxx-xx-xx");
        }
        return err.size() == 0;
    }
    //mac，用于存格式错误数据
    private Map<String,String> err = new HashMap<String,String>();
    public Map<String,String> getErr(){
        return err;
    }
    public void setErr(Map<String,String> err){
        this.err = err;
    }

    /**
     * username : 用户名长度要在5~15
     * password : 密码不能为空
     * email    ：邮箱格式不正确
     * @return
     */
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRepassword() {
        return repassword;
    }

    public void setRepassword(String repassword) {
        this.repassword = repassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
