package com.yang.controller;

import com.yang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
        return "/WEB-INF/success.jsp";
    }
}
