package com.earyant.config.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Created by earyant on 2017 : 09 : 2017/9/21 0021 : 10:55 : .
 * idc  com.earyant.idc.config.listener
 */
@WebListener
public class ContextListener implements ServletContextListener {
    @Override
    public void contextDestroyed(ServletContextEvent arg0) {
        System.out.println("ServletContex销毁");
    }
    @Override
    public void contextInitialized(ServletContextEvent arg0) {
        System.out.println("ServletContex初始化");
    }
}