package com.earyant.common.database.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by earyant on 2017 : 09 : 2017/9/20 0020 : 15:23 : .
 * idc  com.earyant.idc.common.database
 */
@Service
public class RedisDemoService {
    @Autowired
    RedisTemplate<String, String> redisTemplate;
    @Autowired
    StringRedisTemplate stringRedisTemplate;
    @Autowired
    RedisTemplate<String, Object> objectRedisTemplate;

    public String get(String key) {
        return redisTemplate.opsForValue().get(key);
    }
}
