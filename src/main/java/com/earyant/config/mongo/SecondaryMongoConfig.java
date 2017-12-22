package com.earyant.config.mongo;

import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by earyant on 2017 : 09 : 2017/9/21 0021 : 17:04 : .
 * idc  com.earyant.idc.config.mongo
 */
@Configuration
@EnableMongoRepositories(basePackages = "com.earyant.dao.mongo.secondary",
        mongoTemplateRef = SecondaryMongoConfig.MONGO_TEMPLATE)
public class SecondaryMongoConfig {

    protected static final String MONGO_TEMPLATE = "secondaryMongo";
    @Autowired
    @Qualifier("secondaryProperties")
    private MongoProperties mongoProperties;

//    @Primary
    @Bean(name = "secondaryMongo")
    public MongoTemplate statisMongoTemplate() throws Exception {
        return new MongoTemplate(secondaryFactory(secondary()));
    }
    @Bean(name = "secondaryProperties")
    @ConfigurationProperties(prefix = "spring.data.mongodb.secondary")
    MongoProperties secondary() {
        return new MongoProperties();

    }
    @Bean
//    @Primary
    public MongoDbFactory secondaryFactory(MongoProperties mongoProperties) throws Exception {

        ServerAddress serverAdress = new ServerAddress(mongoProperties.getUri());

        return new SimpleMongoDbFactory(new MongoClient(serverAdress), mongoProperties.getDatabase());

    }
}
