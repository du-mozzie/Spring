package com.du.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//等价于<bean id="user" class="com.du.pojo.User"/>
//@Component组件
@Component
public class User {

    @Value("Du")
    public String name;
}