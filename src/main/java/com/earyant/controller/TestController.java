package com.earyant.controller;

import com.earyant.common.database.mongodb.dao.DemoInfo;
import com.earyant.dao.mongo.primary.DemoInfoRepository;
import com.earyant.common.dto.ResultDataDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * Created by earyant on 2017 : 09 : 2017/9/20 0020 : 15:32 : .
 * idc  com.earyant.idc.controller
 */
@RestController
@RequestMapping("/test")
public class TestController {

    Logger logger = LoggerFactory.getLogger(TestController.class);
    @Autowired
    RedisTemplate<String, String> redisTemplate;
    @Autowired
    MongoTemplate mongoTemplate;
    @Autowired
    private RabbitTemplate rabbitTemplate;
    @Autowired
    DemoInfoRepository demoInfoRepository;

    @GetMapping("/redis")
    public Object getRedis(String key) {
        return redisTemplate.opsForValue().get(key);
    }

    @PostMapping("/redis")
    public ResultDataDto postRedis(String key, String value) {
        redisTemplate.opsForValue().set(key, value);
        return new ResultDataDto("200");
    }

    @GetMapping("/mongo")
    public Object getMongo(String id) {
        return demoInfoRepository.findById(id);
    }

    @PostMapping("/mongo")
    public ResultDataDto postMongo(@ModelAttribute DemoInfo demoInfo) {
        demoInfoRepository.save(demoInfo);
        return new ResultDataDto("200");
    }

    @PostMapping("/rabbit")
    public ResultDataDto send(String message) {
        rabbitTemplate.convertAndSend("foo", message);
        return new ResultDataDto("200");
    }
    //接收到消息处理.

    @RabbitListener(queues = "foo")
    public void onMessage(@Payload String foo) {
        logger.info(" >>> " + new Date() + ": " + foo);
    }

    @Cacheable(value = "demo", key = "#demoInfo.id", condition = "#demoInfo.id%2==0")
//     @CachePut("demoInfo")//每次都会执行方法，并将结果存入指定的缓存中
//    @CacheEvict(value="demoInfo", allEntries=true)  allEntries清楚所有// beforeInvocation=true清楚所有
//    @Caching(cacheable = @Cacheable("users"), evict = { @CacheEvict("cache2"),
//    @CacheEvict(value = "cache3", allEntries = true) })
    @PostMapping("/demo")
    public ResultDataDto setDemo(DemoInfo demoInfo) {
        demoInfoRepository.save(demoInfo);
        return new ResultDataDto("200");
    }

}
