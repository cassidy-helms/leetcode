package com.leetcode.remove_duplicates_between_arrays;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

public class RemoveDuplicatesBetweenArraysTest {
    private RemoveDuplicatesBetweenArrays app;

    @Before
    public void initialize() {
        app = new RemoveDuplicatesBetweenArrays();
    }


    @Test
    public void sampleTests() {
      assertArrayEquals(new int[] {2}, app.arrayDiff(new int [] {1,2}, new int[] {1}));
      assertArrayEquals(new int[] {2,2}, app.arrayDiff(new int [] {1,2,2}, new int[] {1}));
      assertArrayEquals(new int[] {1}, app.arrayDiff(new int [] {1,2,2}, new int[] {2}));
      assertArrayEquals(new int[] {1,2,2}, app.arrayDiff(new int [] {1,2,2}, new int[] {}));
      assertArrayEquals(new int[] {}, app.arrayDiff(new int [] {}, new int[] {1,2}));
    }
}
