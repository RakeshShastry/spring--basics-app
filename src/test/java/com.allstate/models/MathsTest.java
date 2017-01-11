package com.allstate.models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class MathsTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void shouldSquareAnInteger () throws Exception {
        int result = Maths.square(4);
        assertEquals(16, result);
    }

    @Test
    public void shouldComputeFactorialofAnInteger () throws Exception {
        int result = Maths.factorial(5);
        assertEquals(120, result);
    }

    @Test
    public void shouldComputeFibonoci () throws Exception{
        int result = Maths.fibinocci(15);
        assertEquals(610,result);
    }


}