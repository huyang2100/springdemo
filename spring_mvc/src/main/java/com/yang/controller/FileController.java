package com.yang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Description:
 * @Author: huyang
 * @Date: 2021/6/22 上午11:25
 */
@RestController
public class FileController {

    @PostMapping("/fileUpload")
    public String fileUp(String username, MultipartFile file){
        return username + " : " +file;
    }
}
