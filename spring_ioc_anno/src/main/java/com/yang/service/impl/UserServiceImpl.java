package com.yang.service.impl;

import com.yang.dao.UserDao;
import com.yang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description:
 * @Author: huyang
 * @Date: 2021/6/16 上午10:51
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public void save() {
        userDao.save();
    }
}
