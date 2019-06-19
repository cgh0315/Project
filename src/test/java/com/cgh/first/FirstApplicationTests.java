package com.cgh.first;

import com.cgh.first.bean.Property;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;



@RunWith(SpringRunner.class)
@SpringBootTest
public class FirstApplicationTests {

    @Autowired
    ApplicationContext ioc;

    @Autowired
    Property property;

    Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void contextLoads() {
        logger.trace("This is trace");
        logger.debug("This is debug");
        logger.info("This is info");
        logger.warn("This is warn");
        logger.error("This is error");
    }

    @Test
    public void testHelloService(){
        boolean b = ioc.containsBean("helloService");
        System.out.println(b);
    }

    @Test
    public void testProperties(){
        System.out.println(property.toString());
    }
}
