package com.yang.controller;

import com.yang.bean.User;
import com.yang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description:
 * @Author: huyang
 * @Date: 2021/6/21 上午10:45
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/save")
    String save(){
        userService.save();
        return "success";
    }

    @GetMapping("/hello")
    @ResponseBody
    String hello(){
        return "Hello Spring MVC";
    }

    @GetMapping("/json")
    @ResponseBody
    User helloJson(){
        User user = new User();
        user.setUsername("胡洋");
        user.setPassword("123456");
        return user;
    }
}
