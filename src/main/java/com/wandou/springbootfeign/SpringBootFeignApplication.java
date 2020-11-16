package com.wandou.springbootfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class SpringBootFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootFeignApplication.class, args);
    }

}
