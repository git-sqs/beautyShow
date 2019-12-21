package com.mac.config;

import com.mac.filter.CorsFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: CarSys
 * @description:
 * @author: Feri
 * @create: 2019-12-11 16:09
 */
@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean creatCF(){
        FilterRegistrationBean bean=new FilterRegistrationBean();
        bean.setFilter(new CorsFilter());
        bean.addUrlPatterns("/*");
        return bean;
    }
    //ServletRegistrationBean
}
