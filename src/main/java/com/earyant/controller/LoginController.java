package com.earyant.controller;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by earyant on 2017 : 09 : 2017/9/21 0021 : 16:06 : .
 * idc  com.earyant.idc.controller
 */
@Controller
@RequestMapping("/")
public class LoginController {

    @GetMapping("/login")
    public String login() {
        return "/login";
    }

    @GetMapping("/index")
    public String index() {
        return "/index";
    }
    /**
     * 用户添加;
     * @return
     */
    @RequestMapping("/user/userAdd")
    @RequiresPermissions("userInfo:add")//权限管理;
    public String userInfoAdd(){
        return "userInfoAdd";
    }

}
