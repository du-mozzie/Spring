package com.du.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class MyLog implements MethodBeforeAdvice {

    /*
    *   method 要执行的对象的方法
    *   args   参数
    *   target 要执行的对象
    * */
    public void before(Method method, Object[] arga, Object target) throws Throwable {
        System.out.println(target.getClass().getName() + "类，调用了" + method.getName() + "方法");
    }
}