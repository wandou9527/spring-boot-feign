package com.wandou.springbootfeign.config;

import feign.MethodMetadata;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Map;
import java.util.logging.Logger;

/**
 * @author liming
 * @date 2020/11/18
 * @description
 */

@Component
public class FeignInterceptor implements RequestInterceptor {

    private final Logger logger = Logger.getLogger(FeignInterceptor.class.getCanonicalName());


    /**
     * Called for every request. Add data using methods on the supplied {@link RequestTemplate}.
     *
     * @param template
     */
    @Override
    public void apply(RequestTemplate template) {
        Collection<String> requestVariables = template.getRequestVariables();
        logger.info("requestVariables: " + requestVariables);
        Map<String, Collection<String>> queries = template.queries();
        logger.info("queries: " + queries);
        byte[] body = template.body();
        logger.info("body: " + body);
        String path = template.path();
        String url = template.url();
        logger.info("path: " + path + "; url: " + url);
//        template.method(Request.HttpMethod.POST);
        MethodMetadata methodMetadata = template.methodMetadata();
        logger.info("methodMetadata: " + methodMetadata);

    }
}
