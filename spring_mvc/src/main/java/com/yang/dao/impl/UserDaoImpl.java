package com.yang.dao.impl;

import com.yang.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @Description:
 * @Author: huyang
 * @Date: 2021/6/21 上午10:43
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("UserDaoImpl save ...");
    }
}
