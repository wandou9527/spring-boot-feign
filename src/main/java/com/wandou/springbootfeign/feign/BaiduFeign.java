package com.wandou.springbootfeign.feign;

import com.wandou.springbootfeign.config.FeignConfig;
import com.wandou.springbootfeign.dto.BaiduParamDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author liming
 * @date 2020/11/16
 * @description
 */

@FeignClient(name = "baidu", url = "http://baidu.com/", configuration = FeignConfig.class, primary = false)
public interface BaiduFeign {

    @RequestMapping("/s")
    String search(@RequestParam("wd") String wd);

    @RequestMapping(path = "/s", method = RequestMethod.GET)
    String searchV2(@SpringQueryMap BaiduParamDTO param);

}
