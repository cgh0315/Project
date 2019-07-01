package com.cgh.first.config;

import com.cgh.first.component.LoginHandlerInterceptor;
import com.cgh.first.component.MyLocaleResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.*;

//@EnableWebMvc
@Configuration
public class MyMvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/guan").setViewName("success");
    }

    @Bean
    public WebMvcConfigurerAdapter loginHtml(){
        WebMvcConfigurerAdapter adapter = new WebMvcConfigurerAdapter(){
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/").setViewName("login");
                registry.addViewController("/index.html").setViewName("login");
                registry.addViewController("/main.html").setViewName("dashboard");
            }

            @Override
            public void addInterceptors(InterceptorRegistry registry) {
//                registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**").excludePathPatterns("/index.html","/","/usr/login","/asserts/**","/webjars/**");
            }

        };
        return adapter;
    }

    @Bean(name="localeResolver")
    public LocaleResolver getLocalResolver(){
        return new MyLocaleResolver();
    }
}
