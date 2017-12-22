package com.earyant.config.mongo;

import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by earyant on 2017 : 09 : 2017/9/21 0021 : 17:03 : .
 * idc  com.earyant.idc.config.mongo
 */
@Configuration
@EnableMongoRepositories(basePackages = "com.earyant.dao.mongo.primary",
        mongoTemplateRef = PrimaryMongoConfig.MONGO_TEMPLATE)
public class PrimaryMongoConfig {

    protected static final String MONGO_TEMPLATE = "primaryMongo";
//    @Autowired
//    @Qualifier("primaryProperties")
//    private MongoProperties mongoProperties;

    @Bean(name = "primaryProperties")
    @Primary
    @ConfigurationProperties(prefix = "spring.data.mongodb.primary")
    MongoProperties primary() {
        return new MongoProperties();
    }

    @Primary
    @Bean(name = "primaryMongo")
    public MongoTemplate statisMongoTemplate() throws Exception {
        return new MongoTemplate(primaryMongoFactory(primary()));
    }

    @Bean
    @Primary
    public MongoDbFactory primaryMongoFactory(MongoProperties mongoProperties) throws Exception {

        ServerAddress serverAdress = new ServerAddress(mongoProperties.getUri());

        return new SimpleMongoDbFactory(new MongoClient(serverAdress), mongoProperties.getDatabase());

    }
}
