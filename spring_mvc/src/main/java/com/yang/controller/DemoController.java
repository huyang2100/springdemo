package com.yang.controller;

import com.yang.bean.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: huyang
 * @Date: 2021/6/21 下午3:33
 */
@RestController
public class DemoController {

    @GetMapping("/json")
    public User json(){
        User user = new User();
        user.setUsername("胡洋");
        user.setPassword("Demo");
        return user;
    }
}
