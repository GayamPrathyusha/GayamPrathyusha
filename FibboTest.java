package com.demo;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import java.util.Arrays;

import org.junit.Test;

public class FibboTest {
    /**
     * 
     */
    
    public ArrayList<Integer> testFibbo(int count) {
        Fibbo fibbo = new Fibbo();
        return fibbo.perform(count);
    }
    @Test
        public void testFibboForZeroLimit1() {
        
            assertEquals(Arrays.asList(0,1,1), testFibbo(2));//check the condition
            
        }
        @Test
        public void testFibboForZeroLimit() {
        
            assertEquals(Arrays.asList(0), testFibbo(0));//check the condition
            
        }
    }
    