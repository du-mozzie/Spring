package com.du.config;

import com.du.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DuConfig {

    @Bean
    public User getUser() {
        return new User();
    }
}