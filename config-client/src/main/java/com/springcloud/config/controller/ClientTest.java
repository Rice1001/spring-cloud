package com.springcloud.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rice
 * @version 1.0
 * @date 2020/6/3 22:31
 */
@RestController
public class ClientTest {

    @Value("${springcloud.hello}")
    private String word;

    @RequestMapping("/hello")
    @ResponseBody
    public String test(){
        return "hello" + this.word;
    }
}
