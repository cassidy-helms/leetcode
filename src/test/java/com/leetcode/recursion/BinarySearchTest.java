package com.leetcode.recursion;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BinarySearchTest {
    private BinarySearch bs;

    @Before
    public void initialize() {
        bs = new BinarySearch();
    }

    @Test
    public void findNumLessThanMidInOddArray() {
        int[] arr = new int[] { 1, 2, 3, 4, 5 };

        assertEquals(bs.binarySearch(arr, 2), 1);
    }

    @Test
    public void findNumGreaterThanMidInOddArray() {
        int[] arr = new int[] { 1, 2, 3, 4, 5 };

        assertEquals(bs.binarySearch(arr, 4), 3);
    }

    @Test
    public void findNumLessThanMidInEvenArray() {
        int[] arr = new int[] { 1, 2, 3, 4, 5, 6 };

        assertEquals(bs.binarySearch(arr, 2), 1);
    }

    @Test
    public void findNumGreaterThanMidInEvenArray() {
        int[] arr = new int[] { 1, 2, 3, 4, 5, 6 };

        assertEquals(bs.binarySearch(arr, 5), 4);
    }

    @Test
    public void findNumEqualToMid() {
        int[] arr = new int[] { 1, 2, 3, 4, 5 };

        assertEquals(bs.binarySearch(arr, 3), 2);
    }

    @Test
    public void emptyArrayReturnsNegativeOne() {
        int[] arr = new int[] {};

        assertEquals(bs.binarySearch(arr, 0), -1);
    }

    @Test
    public void singleElementArrayWithTargetReturnsIndex() {
        int[] arr = new int[] { 1 };

        assertEquals(bs.binarySearch(arr, 1), 0);
    }

    @Test
    public void singleElementArrayMissingTargetReturnsNegativeOne() {
        int[] arr = new int[] { 1 };

        assertEquals(bs.binarySearch(arr, 2), -1);
    }

    @Test
    public void missingElementGreaterThanLastElementReturnsNegativeOne() {
        int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        assertEquals(bs.binarySearch(arr, 11), -1);
    }

    @Test
    public void missingElementLessThanFirstElementReturnsNegativeOne() {
        int[] arr = new int[] { 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        assertEquals(bs.binarySearch(arr, 1), -1);
    }

    @Test
    public void missingElementWithinRangeReturnsNegativeOne() {
        int[] arr = new int[] { 1, 2, 4, 5, 6, 7, 8, 9, 10 };

        assertEquals(bs.binarySearch(arr, 3), -1);
    }
}
