package com.cgh.first.config;

import com.cgh.first.component.MyLocaleResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

//@EnableWebMvc
@Configuration
public class MyMvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/guan").setViewName("success");
    }

//    @Bean
//    public WebMvcConfigurerAdapter loginHtml(){
//        WebMvcConfigurerAdapter adapter = new WebMvcConfigurerAdapter(){
//            @Override
//            public void addViewControllers(ViewControllerRegistry registry) {
//                registry.addViewController("/").setViewName("login");
//                registry.addViewController("/login").setViewName("login");
//            }
//        };
//        return adapter;
//    }

    @Bean(name="localeResolver")
    public LocaleResolver getLocalResolver(){
        return new MyLocaleResolver();
    }
}
