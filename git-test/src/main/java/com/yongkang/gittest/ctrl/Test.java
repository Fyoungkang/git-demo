package com.yongkang.gittest.ctrl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class Test {
    @RequestMapping("/test")
    public String getTest(){
        return "getTest11111" + new Date() + "15" + "15";
    }
}
