package com.wandou.springbootfeign.feign;

import com.wandou.springbootfeign.feign.fallback.MouseFeignFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

/**
 * @author liming
 * @date 2020/11/18
 * @description
 */

// http://127.0.0.1:8086
// http://wandour.top/mouse/
@FeignClient(name = "mouse", url = "http://127.0.0.1:8086", fallback = MouseFeignFallback.class)
public interface MouseFeign {

    @RequestMapping(path = "/commodity/list", method = RequestMethod.POST)
    String listCommodity(@RequestBody Map<String, String> body);

}
