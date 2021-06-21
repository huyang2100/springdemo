package com.yang.service.impl;

import com.yang.config.SpringConfig;
import com.yang.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * @Description:
 * @Author: huyang
 * @Date: 2021/6/16 下午2:58
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {SpringConfig.class})
public class UserServiceImplTest {

    @Autowired
    private UserService userService;

    @Autowired
    private DataSource dataSource;

    @Test
    public void save() {
        userService.save();
        System.out.println(dataSource);
    }
}
