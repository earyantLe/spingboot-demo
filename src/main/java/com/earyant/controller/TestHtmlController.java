package com.earyant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by earyant on 2017 : 09 : 2017/9/21 0021 : 10:24 : .
 * idc  com.earyant.idc.controller
 */
@Controller
@RequestMapping("/html")
public class TestHtmlController {
    /**
     * 返回html模板.
     */
    @GetMapping("/helloHtml")
    public String helloHtml(Map<String, Object> map) {
        map.put("hello", "fromTestController.helloHtml");
        return "/helloHtml";
    }
}
