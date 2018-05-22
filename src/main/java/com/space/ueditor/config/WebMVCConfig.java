package com.space.ueditor.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @author zhuzhe
 * @date 2018/5/22 10:53
 * @email 1529949535@qq.com
 */
@Configuration
public class WebMVCConfig extends WebMvcConfigurationSupport {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        /**
         * 转向index.html页面
         */
        registry.addViewController("/").setViewName("index");
    }
}
