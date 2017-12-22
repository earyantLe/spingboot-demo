package com.earyant.dao.mongo.secondary;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by earyant on 2017 : 09 : 2017/9/21 0021 : 17:09 : .
 * idc  com.earyant.idc.dao.mongo.secondary
 */
public interface SecondaryRepository extends MongoRepository<SecondaryMongoObject, String> {
}
