package com.springcloud.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rice
 * @version 1.0
 * @date 2020/6/3 22:31
 */
@RestController
public class ClientTest {

    @Value("${word}")
    private String word;

    @RequestMapping("/hello")
    public String index(@RequestParam String name){
        return name+","+this.word;
    }
}
