package com.allstate.controllers;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

@RunWith(SpringRunner.class)
@WebMvcTest(MathController.class)

public class MathsControllerTest {
    @Autowired
    private MockMvc mvc;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }
    @Test
    public void shouldSquareAnInteger() throws Exception {
        this.mvc.perform(get("/math/square/4"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.square", is(16)));

    }

    @Test
    public void shouldComputeFactorialOfAnInteger() throws Exception {
        this.mvc.perform(get("/math/factorial/5"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.factorial", is(120)));

    }
    @Test
    public void shouldComputeFibinocciOfAnInteger() throws Exception {
        this.mvc.perform(get("/math/fibinocci/15"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.fibinocci", is(610)));

    }
}