package com.wandou.springbootfeign;

import com.wandou.springbootfeign.dto.BaiduParamDTO;
import com.wandou.springbootfeign.feign.BaiduFeign;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootFeignApplicationTests {

    @Autowired
    private BaiduFeign baiduFeign;

    @Test
    void contextLoads() {
    }

    @Test
    public void testFeign() {
        String result = baiduFeign.search("如何写出一手好字");
//        System.out.println("result = " + result);
    }

    @Test
    public void testFeignV2() {
        BaiduParamDTO paramDTO = new BaiduParamDTO();
        paramDTO.setWd("亚马逊");
        paramDTO.setVersion("v1.1");
        String result = baiduFeign.searchV2(paramDTO);
//        System.out.println("result = " + result);
    }

}
