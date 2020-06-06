package com.spring.cloud.provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rice
 * @version 1.0
 * @date 2020/6/2 16:48
 */

@RestController
public class ProviderController {

    @RequestMapping("get")
    public String  getData(){
        return "提供服务";
    }

    @RequestMapping("/hello")
    public String hello(@RequestParam String name){
        return "hello "+name+",provider is ready";
    }
}
