//package com.earyant.controller.activemq;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jms.annotation.JmsListener;
//import org.springframework.jms.core.JmsMessagingTemplate;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.jms.Queue;
//
///**
// * Created by earyant on 2017 : 09 : 2017/9/25 0025 : 15:42 : .
// * idc  com.earyant.controller.activemq
// */
//@RestController
//@RequestMapping("/activemq")
//public class ActiveMQTestController {
//    @Autowired
//
//    private JmsMessagingTemplate jmsMessagingTemplate;
//    @Autowired
//    private Queue queue;
//    @RequestMapping("/send")
//    public void send() {
//        this.jmsMessagingTemplate.convertAndSend(this.queue, "hi,activeMQ");
//    }
//
//    @JmsListener(destination = "earyant")
//    public void receiveQueue(String text) {
//        System.out.println(text);
//    }
//}
