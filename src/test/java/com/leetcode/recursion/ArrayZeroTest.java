package com.leetcode.recursion;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ArrayZeroTest {
    private ArrayMax am;

    @Before
    public void initialize() {
        am = new ArrayMax();
    }

    @Test
    public void returnsMaxOfSortedArray() {
        int[] arr = new int[] { 1, 2, 3, 4, 5 };

        assertEquals(am.arrayMax(arr), 5);
    }

    @Test
    public void returnsMaxOfUnsortedArray() {
        int[] arr = new int[] { 1, 6, 3, 8, 4, 2, 7 };

        assertEquals(am.arrayMax(arr), 8);
    }

    @Test
    public void emptyArrayReturnsMaxOfZero() {
        int[] arr = new int[] {};

        assertEquals(am.arrayMax(arr), 0);
    }

    @Test
    public void singleElementArrayReturnsElement() {
        int[] arr = new int[] { 1 };

        assertEquals(am.arrayMax(arr), 1);
    }

    @Test
    public void arrayWithAllSameNumberReturnsNumber() {
        int[] arr = new int[] { 3, 3, 3 };

        assertEquals(am.arrayMax(arr), 3);
    }
}
