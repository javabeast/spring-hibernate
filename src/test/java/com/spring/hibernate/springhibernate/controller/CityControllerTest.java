package com.spring.hibernate.springhibernate.controller;

import com.spring.hibernate.springhibernate.service.CityService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@ExtendWith(MockitoExtension.class)
class CityControllerTest {

    private MockMvc mockMvc;

    @InjectMocks
    private CityController cityController;

    @Mock
    private CityService cityService;

    @BeforeEach
    void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(cityController).build();
    }

    @Test
    void testGet() throws Exception {
        mockMvc.perform(get("/city/getAllCity")).andExpect(status().isOk());
    }
}