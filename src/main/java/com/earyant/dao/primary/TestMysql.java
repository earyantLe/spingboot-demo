package com.earyant.dao.primary;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by earyant on 2017 : 10 : 2017/10/19 0019 : 10:09 : .
 * idc  com.earyant.dao.primary
 */
@Entity
@Data
public class TestMysql {
    @Id
    @GeneratedValue
    Long id;

    String name;
    String age;
}
