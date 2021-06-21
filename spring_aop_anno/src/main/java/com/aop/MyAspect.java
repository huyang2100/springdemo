package com.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: huyang
 * @Date: 2021/6/16 下午4:22
 */
@Component
@Aspect
public class MyAspect {
    @Pointcut("execution(* com.aop.*.*(..))")
    void myPointcut(){};

    @Before("myPointcut()")
    void before(){
        System.out.println("anno 方法执行之前...");
    }

    @AfterReturning("myPointcut()")
    void after(){
        System.out.println("anno 方法执行之后...");
    }
}
