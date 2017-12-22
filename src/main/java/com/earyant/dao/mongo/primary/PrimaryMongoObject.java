package com.earyant.dao.mongo.primary;

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
@Document(collection = "first_mongo")
public class PrimaryMongoObject {

    @Id
    private String id;

    private String value;

    @Override
    public String toString() {
        return "PrimaryMongoObject{" + "id='" + id + '\'' + ", value='" + value + '\''
                + '}';
    }
}