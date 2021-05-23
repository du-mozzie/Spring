package com.du.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoOracleImpl implements UserDao{
    public void getUser() {
        System.out.println("调用Oracle");
    }
}