package com.controller;

import com.service.AccountService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description:
 * @Author: huyang
 * @Date: 2021/6/17 上午9:53
 */
public class AppController {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService accountService = app.getBean(AccountService.class);
        accountService.transfer("小明","莉莉",300);
    }
}
