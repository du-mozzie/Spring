package com.du.service;

public class MyCRUDImpl implements MyCRUD{
    public void insert() {
        System.out.println("增加一个用户");
    }

    public void delete() {
        System.out.println("删除一个用户");
    }

    public void update() {
        System.out.println("修改一个用户");
    }

    public void select() {
        System.out.println("查询一个用户");
    }
}