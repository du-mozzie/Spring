package com.du.demo01;

public class Client {
    public static void main(String[] args) {
        //真实角色
        Landlord landlord = new Landlord();

        //生成代理角色
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        //通过调用程序处理角色来处理我们要调用的接口对象
        pih.setRent(landlord);

        Rent proxy = (Rent) pih.getProxy();
        proxy.rent();
    }
}