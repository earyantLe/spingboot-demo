package com.earyant.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by earyant on 2017 : 05 : 2017/5/31 : 14:09 : .
 * qr_pay  com.earyant.config
 *
 */
@Configuration
@EnableSwagger2
public  class Swagger2 {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.earyant"))
                .paths(PathSelectors.any())
                .build();
    }

    public ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("CTSIG支付服务")
                .description("如有问题请联系李睿")
                .termsOfServiceUrl("http://earyant.github.io/")
                .contact("23769262@qq.com")
                .version("1.0")
                .build();
    }
}