package com.earyant.config.environment;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

/**
 * Created by earyant on 2017 : 09 : 2017/9/21 0021 : 11:24 : .
 * idc  com.earyant.idc.config.environment
 */
@Configuration
public class EnvironmentAwareConfig implements EnvironmentAware {
    //注入application.properties的属性到指定变量中.
    @Value("${spring.datasource.primary.url}")
    private String myUrl;
    /**
     *注意重写的方法 setEnvironment 是在系统启动的时候被执行。
     */
    @Override
    public void setEnvironment(Environment environment) {
        //打印注入的属性信息.
        System.out.println("myUrl="+myUrl);
        //通过 environment 获取到系统属性.
        System.out.println(environment.getProperty("JAVA_HOME"));
        //通过 environment 同样能获取到application.properties配置的属性.
        System.out.println(environment.getProperty("spring.datasource.url"));
        //获取到前缀是"spring.datasource." 的属性列表值.
        RelaxedPropertyResolver relaxedPropertyResolver = new RelaxedPropertyResolver(environment,"spring.datasource.primary.");
        System.out.println("spring.datasource.primary.url="+relaxedPropertyResolver.getProperty("url"));
        System.out.println("spring.datasource.primary.driverClassName="+relaxedPropertyResolver.getProperty("driverClassName"));
    }
}