package com.bhl.models;

import java.util.Date;

/**
 * 对应数据库的字段
 * @author baohailong
 */

public class User {
    private Integer id;
    private String username;
    private String password;
    private String email;
    private Date birthday;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public User() {
        super();
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + username + ", password=" + password + ",email=" + email + ",date=" + birthday + "]\n";
    }

}


