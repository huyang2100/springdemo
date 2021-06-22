package com.controller;

import com.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description:
 * @Author: huyang
 * @Date: 2021/6/22 上午9:18
 */
@Controller
public class MyController {

    @ResponseBody
    @GetMapping("/hello")
    String hello(){
        return "Hello World 胡洋";
    }

    @ResponseBody
    @GetMapping("/userU8")
    String helloUser(String name){
        System.out.println(name);
        return name;
    }

    @ResponseBody
    @GetMapping("/userJson")
    User helloUser2(){
        User u = new User();
        u.setName("胡洋");
        u.setAge(20);
        return u;
    }
    @ResponseBody
    @PostMapping("/userObj")
    User helloUser3(@RequestBody User u){
        return u;
    }

}
