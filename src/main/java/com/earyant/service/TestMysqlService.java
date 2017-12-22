package com.earyant.service;

import com.earyant.dao.primary.TestMysql;

/**
 * @author earyant
 * @date 2017 : 10 : 2017/10/19 0019 : 10:14 :
 * idc  com.earyant.service
 */
public interface TestMysqlService {
    /**
     * 保存testMysql
     *
     * @param testMysql 数据
     * @return
     */
    TestMysql post(TestMysql testMysql);

    /**
     * 通过id获取数据
     *
     * @param id id
     * @return
     */
    TestMysql get(Long id);
}
