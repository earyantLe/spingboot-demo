package com.earyant.config;

import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;

import javax.servlet.MultipartConfigElement;

/**
 * Created by earyant on 2017 : 09 : 2017/9/21 0021 : 14:51 : .
 * idc  com.earyant.idc.config
 */
public class MultiPartFileConfig {
    @Bean

    public MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
        //// 设置文件大小限制 ,超了，页面会抛出异常信息，这时候就需要进行异常信息的处理了;
        factory.setMaxFileSize("128MB"); //KB,MB
        /// 设置总上传数据总大小
        factory.setMaxRequestSize("256MB");
        //Sets the directory location wherefiles will be stored.
        //factory.setLocation("路径地址");
        return factory.createMultipartConfig();

    }
}
