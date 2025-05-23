package com.example.notizen_app;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;


/**
 * Create test for the Webapp, if the connection to /create-notiz is possible
 */
@SpringBootTest
@AutoConfigureMockMvc
public class WebappTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGreetEndpoint() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/create-notiz"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }
}