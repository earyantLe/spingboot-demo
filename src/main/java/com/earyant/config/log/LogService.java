package com.earyant.config.log;

import com.earyant.common.util.JsonUtils;
import com.earyant.dao.primary.LogRecord;
import com.earyant.dao.repo.primary.LogRecordRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by earyant on 2017 : 09 : 2017/9/20 0020 : 17:08 : .
 * idc  com.earyant.idc.config.log
 */
@Service
public class LogService {
    Logger logger = LoggerFactory.getLogger(LogService.class);
    @Autowired
    LogRecordRepo logRecordRepo;

    @RabbitListener(queues = "log")
    public void onMessage(@Payload String log) {
        logger.info(" >>> " + new Date() + ": " + log);
        LogRecord logRecord = JsonUtils.parse(log, LogRecord.class);
        logRecordRepo.save(logRecord);
    }
}
