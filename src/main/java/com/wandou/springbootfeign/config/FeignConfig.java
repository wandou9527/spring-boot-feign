package com.wandou.springbootfeign.config;

import feign.Contract;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author liming
 * @date 2020/11/16
 * @description
 */

@Configuration
public class FeignConfig {

    @Bean
    public Contract feignContract() {
        return new feign.Contract.Default();
    }
}
