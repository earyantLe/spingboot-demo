package com.earyant.common.database.mongodb;

import com.earyant.common.database.mongodb.dao.DemoInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by earyant on 2017 : 09 : 2017/9/20 0020 : 15:30 : .
 * idc  com.earyant.idc.common.database.mongodb
 */
@Service
public class MongoDemoService {
    @Autowired
    private MongoTemplate mongoTemplate;

    public List<DemoInfo> get(){
       return mongoTemplate.findAll(DemoInfo.class);
    }
}
