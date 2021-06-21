package com.yang.controller;

import com.yang.bean.User;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

/**
 * @Description:
 * @Author: huyang
 * @Date: 2021/6/21 下午4:59
 */
@RestController
public class ParamController {

    @GetMapping("/param")
    String param(@RequestParam("id") String name, int age){
        return name + age;
    }

    @GetMapping("/paramDef")
    String paramDef(@RequestParam(value = "name",defaultValue = "xxx") String username){
        return username;
    }

    @GetMapping("/paramObj")
    String paramObj(User user){
        return user.toString();
    }

    @GetMapping("/params")
    String params(String[] names){
        return Arrays.toString(names);
    }

    @PostMapping("/paramList")
    User paramList(@RequestBody List<User> userList){
        return userList.get(0);
    }
}
