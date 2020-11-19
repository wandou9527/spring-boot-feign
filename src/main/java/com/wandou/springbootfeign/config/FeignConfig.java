package com.wandou.springbootfeign.config;

import feign.Contract;
import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author liming
 * @date 2020/11/16
 * @description 配置
 * 这个配置是可选的，当需要使用时这样引入：@FeignClient(name = "baidu", url = "http://baidu.com/", configuration = FeignConfig.class, primary = false)
 */

@Configuration
public class FeignConfig {

    /**
     * 如需使用spring系的注解（RequestMapping、RequestParam等）可以不加如下 Contract 配置
     * 或者返回 SpringMvcContract
     */
//    @Bean
    public Contract feignContract() {
//        SpringMvcContract springMvcContract = new SpringMvcContract();
        Contract.Default defaultContract = new Contract.Default();
        return defaultContract;
    }

    @Bean
    public Logger.Level loggerLevel() {
        Logger.Level level = Logger.Level.BASIC;
        return level;
    }
}
