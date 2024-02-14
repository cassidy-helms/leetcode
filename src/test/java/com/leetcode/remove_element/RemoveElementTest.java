package com.leetcode.remove_element;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class RemoveElementTest {
    private RemoveElement app;
    private int[] nums;
    private int val;
    private int expectedResult;

    @Before
    public void initialize() {
        app = new RemoveElement();
    }

    public RemoveElementTest(int[] nums, int val, int expectedResult) {
        this.nums = nums;
        this.val = val;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> arrays() {
        return Arrays.asList(new Object[][] {
            {new int[] {3, 2, 2, 3}, 3, 2},
            {new int[] {0, 1, 2, 2, 3, 0, 4, 2}, 2, 5},
            {new int[] {1, 1, 1, 1}, 1, 0},
            {new int[] {1, 2, 3, 4}, 5, 4}
        });
    }

    @Test
    public void testRemoveElement()
    {
        assertEquals(expectedResult, app.removeElement(nums, val));
    }
}
