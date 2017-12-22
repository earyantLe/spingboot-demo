package com.earyant.dao.primary;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * @author earyant
 * @date 2017 : 09 : 2017/9/20 0020 : 17:38 :
 * idc  com.earyant.idc.dao
 */
@Entity
@Data
public class LogRecord implements Serializable {
    @Id
    @GeneratedValue
    Long id;
    /**
     * request
     */
    String requestSession;
    String requestContextPath;
    String requestUrI;
    String requestQueryString;
    String requestMethod;
    String requestIp;

    /**
     * reponse
     */
    String responseString;
    int responseStatus;
    Date createTime = new Date();
}
