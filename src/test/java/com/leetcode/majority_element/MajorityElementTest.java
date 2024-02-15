package com.leetcode.majority_element;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class MajorityElementTest {
    private int[] nums;
    private int expectedResult;
    private MajorityElement app;

    @Before
    public void initialize() {
        app = new MajorityElement();
    }

    public MajorityElementTest(int[] nums, int expectedResult) {
        this.nums = nums;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> arrays() {
        return Arrays.asList(new Object[][] {
            {new int[] {3, 2, 3}, 3},
            {new int[] {2, 2, 1, 1, 1, 2, 2}, 2},
            {new int[] {1, 1, 1, 1}, 1},
            {new int[] {1}, 1},
        });
    }

    @Test
    public void testMajorityElementSimplest()
    {
        assertEquals(expectedResult, app.majorityElementSimplest(nums));
    }

    @Test
    public void testMajorElement()
    {
        assertEquals(expectedResult, app.majorElement(nums));
    }
}