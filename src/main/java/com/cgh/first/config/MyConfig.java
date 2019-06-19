package com.cgh.first.config;

import com.cgh.first.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    public HelloService helloService(){
        System.out.println("给容器添加主见了");
        return new HelloService();
    }
}
