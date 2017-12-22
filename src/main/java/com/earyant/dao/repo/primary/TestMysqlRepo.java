package com.earyant.dao.repo.primary;

import com.earyant.dao.primary.TestMysql;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by earyant on 2017 : 10 : 2017/10/19 0019 : 10:10 : .
 * idc  com.earyant.dao.repo.primary
 *
 * @author earyant
 */
public interface TestMysqlRepo extends JpaRepository<TestMysql, Long> {
    /**
     * 通过名字查找数据
     *
     * @param name 名字
     * @return
     */
    List<TestMysql> findByName(String name);
}
