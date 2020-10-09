package com.fingertip_rhythm.springcloud.eureka;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * eureka注册中心
 */
@SpringBootApplication
@EnableEurekaServer // 声明这是一个eureka服务
public class AppEureka {

    public static void main(String[] args) {
        SpringApplication.run(AppEureka.class, args);
    }
}
