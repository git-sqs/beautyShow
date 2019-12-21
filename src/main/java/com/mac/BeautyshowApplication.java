package com.mac;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
@MapperScan("com.mac.**.dao")
public class BeautyshowApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeautyshowApplication.class, args);
        System.err.println("！！！美妆项目启动成功！！！");
    }

}
