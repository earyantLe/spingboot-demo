package com.earyant.config.startup;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by earyant on 2017 : 09 : 2017/9/21 0021 : 11:06 : .
 * idc  com.earyant.idc.config.startup
 */
@Component

@Order(value = 1)//启动顺序，越大越先启动
public class StartupRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println(">>>>>>>>>>>>>>>服务启动执行，执行加载数据等操作<<<<<<<<<<<<<");
    }
}