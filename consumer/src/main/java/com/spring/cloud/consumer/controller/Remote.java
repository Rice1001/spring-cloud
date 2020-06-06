package com.spring.cloud.consumer.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * @author rice
 * @version 1.0
 * @date 2020/6/6 15:02
 */
@FeignClient(name="provider",fallback = FallBack.class)
public interface Remote {

    @RequestMapping(value = "/hello")
    String hello (@RequestParam(value = "name") String name);
}
