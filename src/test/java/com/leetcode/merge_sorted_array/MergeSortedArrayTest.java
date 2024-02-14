package com.leetcode.merge_sorted_array;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
 public class MergeSortedArrayTest {
    private MergeSortedArray app;
    private int[] nums1;
    private int m;
    private int[] nums2;
    private int n;
    private int[] expectedResult;
    
    @Before
    public void initialize() {
        app = new MergeSortedArray();
    }

    public MergeSortedArrayTest(int[] nums1, int m, int[] nums2, int n, int[] expectedResult) {
        this.nums1 = nums1;
        this.m = m;
        this.nums2 = nums2;
        this.n = n;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> arrays() {
        return Arrays.asList(new Object[][] {
            {new int[] {1, 2, 3, 0, 0, 0}, 3, new int[] {2, 5, 6}, 3, new int[] {1, 2, 2, 3, 5, 6}},
            {new int[] {1}, 1, new int[] {}, 0, new int[] {1}},
            {new int[] {0}, 0, new int[] {1}, 1, new int[] {1}},
            {new int[] {3, 4, 6, 0, 0, 0}, 3, new int[] {1, 3, 5}, 3, new int[] {1, 3, 3, 4, 5, 6}}
        });
    }

    @Test
    public void testMergeSortedArray()
    {
        assertArrayEquals(expectedResult, app.merge(nums1, m, nums2, n));
    }
}
