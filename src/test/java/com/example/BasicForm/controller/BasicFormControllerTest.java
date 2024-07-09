package com.example.BasicForm.controller;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@WebMvcTest(BasicFormController.class)
public class BasicFormControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void submitForm() throws Exception {
        this.mockMvc.perform(post("/submitForm")
                        .param("username", "abc"))
                .andExpect(status().isOk())
                .andExpect(view().name("abc"))
                .andExpect(model().attributeExists("<name>"))
                .andExpect(model().attribute("<name>", "<value>"))
                .andExpect(content().string(""));
    }
}
