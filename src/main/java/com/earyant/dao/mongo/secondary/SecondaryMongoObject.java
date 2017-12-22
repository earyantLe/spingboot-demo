package com.earyant.dao.mongo.secondary;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by earyant on 2017 : 09 : 2017/9/21 0021 : 17:07 : .
 * idc  com.earyant.idc.dao.mongo.primary
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "secondary_mongo")
public class SecondaryMongoObject {

    @Id
    private String id;

    private String value;

    @Override
    public String toString() {
        return "SecondaryMongoObject{" + "id='" + id + '\'' + ", value='" + value + '\''
                + '}';
    }
}