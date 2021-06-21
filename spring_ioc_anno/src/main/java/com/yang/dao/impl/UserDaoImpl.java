package com.yang.dao.impl;

import com.yang.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @Description:
 * @Author: huyang
 * @Date: 2021/6/16 上午10:04
 */
@Repository
public class UserDaoImpl implements UserDao {
    public void save() {
        System.out.println("UserDaoImpl save ...");
    }
}
