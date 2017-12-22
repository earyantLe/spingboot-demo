package com.earyant.dao.mongo.primary;

import com.earyant.common.database.mongodb.dao.DemoInfo;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by earyant on 2017 : 09 : 2017/9/20 0020 : 15:28 : .
 * idc  com.earyant.idc.common.database.mongodb.respository
 */
public interface DemoInfoRepository extends MongoRepository<DemoInfo, String> {
    DemoInfo findByName(String name);

    DemoInfo findById(String id);
}
