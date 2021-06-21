package com.dao;

/**
 * @Description:
 * @Author: huyang
 * @Date: 2021/6/17 上午9:46
 */
public interface AccountDao {
    void out(String outMan, double money);
    void in(String inMan, double money);
}
