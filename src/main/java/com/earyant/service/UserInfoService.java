package com.earyant.service;

import com.earyant.dao.primary.UserInfo;

/**
 * Created by earyant on 2017 : 09 : 2017/9/21 0021 : 15:52 : .
 * idc  com.earyant.idc.service
 */
public interface UserInfoService {
    /**通过username查找用户信息;*/
    public UserInfo findByUsername(String username);
}
