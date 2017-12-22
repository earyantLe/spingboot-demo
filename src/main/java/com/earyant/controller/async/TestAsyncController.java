package com.earyant.controller.async;

import com.earyant.controller.async.task.Task1;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by earyant on 2017 : 09 : 2017/9/25 0025 : 11:24 : .
 * idc  com.earyant.controller.async
 */
@RestController
@RequestMapping("/async")
public class TestAsyncController {



    @RequestMapping("/task1")
    public String task1() throws Exception {
        Task1 task1 = new Task1();
        task1.doTaskOne();
        task1.doTaskTwo();
        task1.doTaskThree();
        return "task1";
    }
}
