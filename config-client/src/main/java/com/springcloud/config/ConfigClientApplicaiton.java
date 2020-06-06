package com.springcloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author rice
 * @version 1.0
 * @date 2020/6/3 22:20
 */

@SpringBootApplication
@EnableDiscoveryClient
public class ConfigClientApplicaiton {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplicaiton.class);
    }

}
