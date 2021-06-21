package com.aop;

import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: huyang
 * @Date: 2021/6/16 下午4:20
 */
@Component
public class MyTarget{

    public void save() {
        System.out.println("MyTarget save ...");
    }
}
