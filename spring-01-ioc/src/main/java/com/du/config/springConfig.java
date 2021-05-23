package com.du.config;

import com.du.dao.UserDaoImpl;
import com.du.dao.UserDaoMysqlImpl;
import com.du.dao.UserDaoOracleImpl;
import com.du.service.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class springConfig {

    @Bean
    public UserDaoImpl UserDaoImpl() {
        return new UserDaoImpl();
    }

    @Bean
    public UserDaoMysqlImpl UserDaoMysqlImpl() {
        return new UserDaoMysqlImpl();
    }

    @Bean
    public UserDaoOracleImpl UserDaoOracleImpl() {
        return new UserDaoOracleImpl();
    }

    @Bean
    public UserServiceImpl UserServiceImpl() {
        return new UserServiceImpl();
    }

}