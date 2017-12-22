package com.earyant.dao.primary;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by earyant on 2017 : 09 : 2017/9/20 0020 : 15:59 : .
 * idc  com.earyant.idc.dao
 */
@Data
public class User implements Serializable {
    private String name;
    private String age;
    private String pass;
}
