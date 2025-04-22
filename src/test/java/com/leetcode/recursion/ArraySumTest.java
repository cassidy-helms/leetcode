package com.leetcode.recursion;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.junit.Before;

public class ArraySumTest {
    private ArraySum as;

    @Before
    public void initialize() {
        as = new ArraySum();
    }

    @Test
    public void calculatesSumOfArray() {
        int[] arr = new int[] { 1, 2, 3, 4, 5 };

        assertEquals(as.arraySum(arr), 15);
    }

    @Test
    public void emptyArrayReturnsSumOfZero() {
        int[] arr = new int[] {};

        assertEquals(as.arraySum(arr), 0);
    }

    @Test
    public void singleElementArrayReturnsElement() {
        int[] arr = new int[] { 5 };
        
        assertEquals(as.arraySum(arr), 5);
    }

    @Test
    public void calculatesSumWithNegativeNumbers() {
        int[] arr = new int[] { 1, -2, 3, -4, 5 };

        assertEquals(as.arraySum(arr), 3);
    }
}
