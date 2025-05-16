package com.example.cicddemo.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(DemoController.class)
public class DemoControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    void greetWithoutTextParam_returnsLifestyleInRed() throws Exception {
        mockMvc.perform(get("/greet"))
                .andExpect(status().isOk())
                .andExpect(content().string("<html><body><h1>Make <span style=\"color:red;\">LIFESTYLE</span> Awesome!</h1></body></html>"));
    }

    @Test
    void greetWithTextParam_returnsTextInBlue() throws Exception {
        mockMvc.perform(get("/greet").param("text", "java"))
                .andExpect(status().isOk())
                .andExpect(content().string("<html><body><h1>Make <span style=\"color:blue;\">JAVA</span> Awesome!</h1></body></html>"));
    }
}
