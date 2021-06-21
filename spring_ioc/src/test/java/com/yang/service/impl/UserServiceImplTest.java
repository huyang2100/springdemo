package com.yang.service.impl;

import com.yang.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description:
 * @Author: huyang
 * @Date: 2021/6/16 上午10:52
 */
class UserServiceImplTest {

    @Test
    void save() {
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = app.getBean(UserService.class);
        userService.save();
    }
}