package com.earyant.dao.mongo.primary;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by earyant on 2017 : 09 : 2017/9/21 0021 : 17:08 : .
 * idc  com.earyant.idc.dao.mongo.primary
 */
public interface PrimaryRepository extends MongoRepository<PrimaryMongoObject, String> {
}
