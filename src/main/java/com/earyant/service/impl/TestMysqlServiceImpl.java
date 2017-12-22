package com.earyant.service.impl;

import com.earyant.dao.primary.TestMysql;
import com.earyant.dao.repo.primary.TestMysqlRepo;
import com.earyant.service.TestMysqlService;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author earyant
 * @date 2017 : 10 : 2017/10/19 0019 : 10:14 :
 * idc  com.earyant.service.impl
 */
@Service
@Slf4j
public class TestMysqlServiceImpl implements TestMysqlService {
    @Autowired
    TestMysqlRepo testMysqlRepo;

    @Override
    public TestMysql post(TestMysql testMysql) {
        List<TestMysql> testMysqlList = Lists.newArrayList();
        for (int j = 0; j < 10000; j++) {
            for (long i = 10000000 + j * 1000; i < 10000000 + (j + 1) * 1000; i++) {
                testMysql.setName("earyant" + i);
                testMysql.setId(i);
                testMysql.setAge(i + "");
                testMysqlList.add(testMysql);
            }
            testMysqlRepo.save(testMysqlList);
        }
        return testMysql;
    }

    @Override
    public TestMysql get(Long id) {
        long startTime = System.currentTimeMillis();
        TestMysql testMysql = testMysqlRepo.findOne(id);
        long entTime = System.currentTimeMillis();
        log.info("time is {} ms", entTime - startTime);
        return testMysql;
    }

    public List<TestMysql> get(String name) {
        long startTime = System.currentTimeMillis();
        List<TestMysql> testMysql = testMysqlRepo.findByName(name);
        long entTime = System.currentTimeMillis();
        log.info("time is {} ms", entTime - startTime);
        return testMysql;
    }
}
