package com.wandou.springbootfeign;

import com.wandou.springbootfeign.feign.MouseFeign;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.logging.Logger;

/**
 * @author liming
 * @date 2020/11/18
 * @description
 */

@SpringBootTest
public class MouseTest {

    @Autowired
    private MouseFeign mouseFeign;

    Logger logger = Logger.getLogger(MouseTest.class.getCanonicalName());

    public void doTestListCommodity() {
        System.out.println(mouseFeign.getClass().getCanonicalName());
        String result = mouseFeign.listCommodity(new HashMap<>());
        logger.info("listCommodity result: " + result);
    }

    @Test
    public void testListCommodity() throws InterruptedException {
        for (int i = 0; i < 1000; i++) {
            doTestListCommodity();
            Thread.sleep(1 * 1000L);
        }
    }

}
