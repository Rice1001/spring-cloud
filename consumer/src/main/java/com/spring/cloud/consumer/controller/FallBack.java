package com.spring.cloud.consumer.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author rice
 * @version 1.0
 * @date 2020/6/6 16:23
 */
@Component
public class FallBack implements Remote {


    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "hello "+ name + ", i am fallback message";
    }
}
