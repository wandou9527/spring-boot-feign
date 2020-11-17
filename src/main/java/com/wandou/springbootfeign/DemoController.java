package com.wandou.springbootfeign;

import com.wandou.springbootfeign.feign.BaiduFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author liming
 * @date 2020/11/13
 * @description
 */

@RequestMapping("/demo")
@RestController
public class DemoController {

    @Autowired
    private BaiduFeign baiduFeign;

    @GetMapping
    public Object demo() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String dateTime = LocalDateTime.now().format(formatter);
        return "我是一个好青年. " + dateTime;
    }

    @ResponseBody
    @GetMapping("/baidu")
    public Object baidu() {
        String result = baiduFeign.search("Java");
        System.out.println("result = " + result);
        return result;
    }

}
