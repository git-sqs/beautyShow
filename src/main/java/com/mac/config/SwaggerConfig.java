package com.mac.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @Author: sqs
 * @Date: 2019/12/10 16:23
 * @Description: swagger2的配置类
 * @Version: 1.0
 */
@Configuration
public class SwaggerConfig {

    /**
     * 创建文档说明
     * @return ApiInfo
     */
    public ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("美妆商城项目后端数据接口").
                description("包含美妆商城的主站和后台系统的所有接口信息，可以查看对应的接口信息和对接口进行测试")
                .version("1.0.0")
                .termsOfServiceUrl("http://xxx.xxx.com")
                .license("LICENSE")
                .licenseUrl("http://xxx.xxx.com")
                .build();

    }

    /**
     * 创建Swagger扫描信息
     * @return Docket
     */
    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.mac"))
                .build();
    }

}
