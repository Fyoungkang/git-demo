package com.yongkang.gittest.ctrl;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Docker {
    @RequestMapping("/user")
    public String getUser(){
        return "yongkang";
    }
}
