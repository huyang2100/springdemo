package com.yang.service.impl;

import com.yang.dao.UserDao;
import com.yang.service.UserService;

/**
 * @Description:
 * @Author: huyang
 * @Date: 2021/6/16 上午10:51
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save() {
        userDao.save();
    }
}
