package com.atguigu.demojenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LiaoZQ
 * @version 1.0
 * @date 2020/8/21 9:22
 */
@RestController
@RequestMapping("/findall")
public class TextController {

    @GetMapping
    public String getAll() {
        return  "hello world";
    }
}
