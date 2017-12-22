package com.earyant;

import com.earyant.controller.async.TestAsyncController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by earyant on 2017 : 09 : 2017/9/25 0025 : 13:57 : .
 * idc  com.earyant
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestAsync {
    //模拟mvc对象类.
    private MockMvc mvc;

    @Before
    public void setup() {
        /*
         * MockMvcBuilders使用构建MockMvc对象.
         */
        mvc = MockMvcBuilders.standaloneSetup(new TestAsyncController()).build();
    }

    @Test
    public void test() throws Exception {

        //1. get 以下user列表，应该为空》
        //1、构建一个get请求.
        RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/async/task1");
        mvc.perform(requestBuilder).andExpect(status().isOk()).andExpect(content().string("task1"));
    }

}
