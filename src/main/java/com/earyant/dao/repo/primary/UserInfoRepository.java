package com.earyant.dao.repo.primary;

import com.earyant.dao.primary.UserInfo;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by earyant on 2017 : 09 : 2017/9/21 0021 : 15:51 : .
 * idc  com.earyant.idc.dao.repo.primary
 */
public interface UserInfoRepository extends CrudRepository<UserInfo,Long> {

    /**通过username查找用户信息;*/
    public UserInfo findByUsername(String username);

}