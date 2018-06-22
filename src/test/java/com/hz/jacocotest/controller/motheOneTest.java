package com.hz.jacocotest.controller;


import com.hz.jacocotest.DemoApplication;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.DEFINED_PORT;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DemoApplication.class,
        webEnvironment = DEFINED_PORT)
public class motheOneTest {

    @Autowired
    private WebApplicationContext webApplicationContext;
    private MockMvc mockMvc;

    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void aa ()throws Exception{
        mockMvc.perform(post("/cosy/test")
                .param("a","10")
                .param("b","11"))
                .andExpect(status().isOk())
                .andReturn();
    }


    @Test
    public void bb ()throws Exception{
        mockMvc.perform(post("/cosy/test")
                .param("a","0")
                .param("b","0"))
                .andExpect(status().isOk())
                .andReturn();
    }


}
