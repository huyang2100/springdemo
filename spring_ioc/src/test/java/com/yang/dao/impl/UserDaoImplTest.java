package com.yang.dao.impl;

import com.yang.dao.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Description:
 * @Author: huyang
 * @Date: 2021/6/16 上午10:08
 */
class UserDaoImplTest {

    @Test
    void save() {
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserDao userDao = (UserDao) app.getBean("userDao");
        UserDao userDao = app.getBean(UserDao.class);
        userDao.save();
    }

    @Test
    void c3p0(){
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        DataSource dataSource = (DataSource) app.getBean("c3p0DataSource");
        System.out.println(dataSource);
    }

    @Test
    void druid(){
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        DataSource dataSource = (DataSource) app.getBean("druidDataSource");
        System.out.println(dataSource);
    }
}