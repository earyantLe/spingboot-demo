package com.earyant.common.database.mongodb.dao;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import java.io.Serializable;

/**
 * Created by earyant on 2017 : 09 : 2017/9/20 0020 : 15:27 : .
 * idc  com.earyant.idc.common.database.mongodb.dao
 */
@Data
@Entity
public class DemoInfo implements Serializable {
    //id属性是给mongodb用的，用@Id注解修饰

    @Id
    @GeneratedValue
    private String id;

    private String name;

    private int age;
}
