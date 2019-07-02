package com.cgh.first.config;

import com.cgh.first.service.HelloService;
import com.cgh.first.servlet.MyFilter;
import com.cgh.first.servlet.MyListener;
import com.cgh.first.servlet.MyServlet;
import org.springframework.boot.web.embedded.jetty.ConfigurableJettyWebServerFactory;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;


@Configuration
public class MyConfig {

    @Bean
    public HelloService helloService(){
        System.out.println("给容器添加主见了");
        return new HelloService();
    }
//
//    @Bean
//    public ServletRegistrationBean servlet(){
//        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new MyServlet(), "/myServlet");
//        servletRegistrationBean.setLoadOnStartup(1);
//        return servletRegistrationBean;
//    }
//
//    @Bean
//    public FilterRegistrationBean filter(){
//        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new MyFilter());
//        filterRegistrationBean.setUrlPatterns(Arrays.asList("/filter","/myServlet"));
//        return filterRegistrationBean;
//    }
//
//    @Bean
//    public ServletListenerRegistrationBean listener(){
//        ServletListenerRegistrationBean<MyListener> registrationBean = new ServletListenerRegistrationBean<>(new MyListener());
//        return registrationBean;
//    }

    @Bean
    public WebServerFactoryCustomizer<ConfigurableJettyWebServerFactory> webServerFactoryCustomizer(){
        return new WebServerFactoryCustomizer<ConfigurableJettyWebServerFactory>() {

            @Override
            public void customize(ConfigurableJettyWebServerFactory factory) {
                factory.setPort(9001);
                System.out.println("Jetty.....");
            }
        };
    }
}
