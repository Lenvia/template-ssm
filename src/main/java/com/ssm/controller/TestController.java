package com.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * FileName: TestController
 * Author: Runpu
 * Date: 2022/10/3 22:22s
 */
@Controller
public class TestController {

    @RequestMapping("/hello")
    public String Hello(){
        return "success";
    }
}
