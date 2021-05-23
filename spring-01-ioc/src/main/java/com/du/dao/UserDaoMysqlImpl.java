package com.du.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoMysqlImpl implements UserDao {
    public void getUser() {
        System.out.println("调用mysql");
    }
}