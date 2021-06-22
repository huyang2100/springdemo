package com.yang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @Description:
 * @Author: huyang
 * @Date: 2021/6/22 上午11:25
 */
@RestController
public class FileController {

    @PostMapping("/fileUpload")
    public String fileUp(String username, MultipartFile file){
        String filename = file.getOriginalFilename();
        String webappRoot = getClass().getResource("/").getPath().replaceAll("/WEB-INF/classes/", "");
        File destFile = new File(webappRoot+"/img", filename);

        try {
            file.transferTo(destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return username + " : " +file;
    }
}
