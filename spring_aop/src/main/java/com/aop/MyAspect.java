package com.aop;

/**
 * @Description:
 * @Author: huyang
 * @Date: 2021/6/16 下午4:22
 */
public class MyAspect {
    void before(){
        System.out.println("方法执行之前...");
    }

    void after(){
        System.out.println("方法执行之后...");
    }
}
