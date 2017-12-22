//package com.earyant;
//
//import com.earyant.controller.activemq.ActiveMQTestController;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.RequestBuilder;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//
///**
// * Created by earyant on 2017 : 09 : 2017/9/25 0025 : 15:44 : .
// * idc  com.earyant
// */
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class TestActiveMQ {
//    private MockMvc mvc = MockMvcBuilders.standaloneSetup(new ActiveMQTestController()).build();
//
//    @Test
//    public void send() throws Exception {
//        RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/activemq/send/");
//        mvc.perform(requestBuilder);
//    }
//}
