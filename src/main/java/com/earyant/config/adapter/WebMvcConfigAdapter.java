package com.earyant.config.adapter;

import com.earyant.config.interceptor.WebInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by earyant on 2017 : 09 : 2017/9/20 0020 : 15:54 : .
 * idc  com.earyant.idc.config.adapter
 */
@Configuration
public class WebMvcConfigAdapter extends WebMvcConfigurerAdapter {

    @Bean
    WebInterceptor webInterceptor(){
        return new WebInterceptor();
    }
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("html").addResourceLocations("classpath:/html");
        super.addResourceHandlers(registry);
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("login");
        super.addViewControllers(registry);
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(webInterceptor()).addPathPatterns("/**").excludePathPatterns("toLogin", "swagger-ui.html","login");
        super.addInterceptors(registry);
    }
}
