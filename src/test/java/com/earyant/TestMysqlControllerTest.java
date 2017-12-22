package com.earyant;

import com.earyant.controller.mysql.TestMysqlController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Random;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by earyant on 2017 : 10 : 2017/10/19 0019 : 10:22 : .
 * idc  com.earyant
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestMysqlControllerTest {
    //模拟mvc对象类.
    private MockMvc mvc;
    @Autowired
    TestMysqlController testMysqlController;

    @Before
    public void setup() {
        /*
         * MockMvcBuilders使用构建MockMvc对象.
         */
        mvc = MockMvcBuilders.standaloneSetup(testMysqlController).build();
    }

    @Test
    public void test() throws Exception {

        /*
        1. get 以下user列表，应该为空》
        1、构建一个get请求.
        */

        int random = new Random().nextInt(10);
            RequestBuilder requestBuilder = MockMvcRequestBuilders.post("/mysql/").param("name", "lirui" + random).param("id",  "").param("age", random + "");
            mvc.perform(requestBuilder).andExpect(status().isOk());

    }
    @Test
    public void get() throws Exception {
        RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/1999");
        mvc.perform(requestBuilder).andExpect(status().isOk());
    }

}
