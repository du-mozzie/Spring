package com.du.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class hello {
    private  String str;

    public String getStr() {
        return str;
    }

    @Value("hello")
    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "hello{" +
                "str='" + str + '\'' +
                '}';
    }
}