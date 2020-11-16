package com.wandou.springbootfeign;

import com.wandou.springbootfeign.feign.BaiduFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

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
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return "我是一个好青年. " + dateFormat.format(new Date());
    }

    @ResponseBody
    @GetMapping("/baidu")
    public Object baidu() {
        String result = baiduFeign.search("Java");
        System.out.println("result = " + result);
        return result;
    }

}
