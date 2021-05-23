package com.du.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User {
    private String name;
    private String age;

    /*public User() {
        System.out.println("无参构造方法");
    }*/

    public User(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public User() {

    }

    public String getName() {
        return name;
    }

    @Value("Du")
    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    @Value("19")
    public void setAge(String age) {
        this.age = age;
    }

    public  void show(){
        System.out.println("name=" + name);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}