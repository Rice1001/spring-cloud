package com.spring.cloud.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rice
 * @version 1.0
 * @date 2020/6/6 15:05
 */
@RestController
public class HelloController {
    @Autowired
    Remote remote;

    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name){
        return remote.hello(name);
    }
}
