package com.earyant.dao.repo.primary;

import com.earyant.dao.primary.LogRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by earyant on 2017 : 09 : 2017/9/20 0020 : 18:08 : .
 * idc  com.earyant.idc.dao.repo
 */
@Repository
public interface LogRecordRepo extends JpaRepository<LogRecord, Long> {
}
