package com.du.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AnnotationPointCut {

    @Before("execution(* com.du.service.MyCRUDImpl.*(..))")
    public void before() {
        System.out.println("-----------执行前----------");
    }

    @After("execution(* com.du.service.MyCRUDImpl.*(..))")
    public void after() {
        System.out.println("-----------执行后----------");
    }

    @Around("execution(* com.du.service.MyCRUDImpl.*(..))")
    public void around(ProceedingJoinPoint pj) throws Throwable {
        System.out.println("执行前");
        Object proceed = pj.proceed();
        System.out.println("执行后");

    }

}