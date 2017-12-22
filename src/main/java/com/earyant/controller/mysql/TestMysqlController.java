package com.earyant.controller.mysql;

import com.earyant.dao.primary.TestMysql;
import com.earyant.service.impl.TestMysqlServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by earyant on 2017 : 10 : 2017/10/19 0019 : 10:08 : .
 * idc  com.earyant.controller.mysql
 */
@RestController
@Slf4j
@RequestMapping("/mysql")
public class TestMysqlController {
    @Autowired
    TestMysqlServiceImpl testMysqlService;

    @GetMapping("/{id}")
    public TestMysql get(@PathVariable() Long id) {
        return testMysqlService.get(id);
    }

    @GetMapping("/")
    public List<TestMysql> get(@RequestParam String name) {
        return testMysqlService.get(name);
    }

    @PostMapping
    public TestMysql post(TestMysql testMysql) {
        return testMysqlService.post(testMysql);
    }
}
