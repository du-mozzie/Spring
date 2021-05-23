package com.du.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao{
    public void getUser() {
        System.out.println("调用普通方法");
    }
}