package com.wandou.springbootfeign.feign.fallback;

import com.wandou.springbootfeign.feign.MouseFeign;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author liming
 * @date 2020/11/18
 * @description
 */
@Component
public class MouseFeignFallback implements MouseFeign {

    @Override
    public String listCommodity(Map<String, String> body) {
        return "fallback process!";
    }
}
