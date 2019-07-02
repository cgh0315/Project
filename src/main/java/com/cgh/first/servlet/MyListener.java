package com.cgh.first.servlet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("监听器启动......");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("监听器结束.......");
    }
}
