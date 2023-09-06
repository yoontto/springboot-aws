package com.jpa.book.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)    //부트 테스트와 JUnit 사이의 연결자
@WebMvcTest   //Web에 집중해서 테스트 (Controller, ControllerAdvice 사용 가능)
public class HelloControllerTest {

    //API 테스트용 어노테이션
    @Autowired private MockMvc mvc;

    @Test
    public void hello() throws Exception {
        String hello = "hello";

        //helloController의 hello 메소드에서 반환하는 값이 String hello인지 확인
        mvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string(hello));
    }

}
