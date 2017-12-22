package com.earyant.service.impl;

import com.earyant.dao.primary.UserInfo;
import com.earyant.dao.repo.primary.UserInfoRepository;
import com.earyant.service.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by earyant on 2017 : 09 : 2017/9/21 0021 : 15:53 : .
 * idc  com.earyant.idc.service.impl
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Resource
    private UserInfoRepository userInfoRepository;
    @Override
    public UserInfo findByUsername(String username) {
        System.out.println("UserInfoServiceImpl.findByUsername()");
        return userInfoRepository.findByUsername(username);
    }
}
