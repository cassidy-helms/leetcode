package com.leetcode.remove_duplicates_max_two;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class RemoveDuplicatesTest {
    private RemoveDuplicates app;
    private int[] nums;
    private int expectedResult;
    
    @Before
    public void initialize() {
        app = new RemoveDuplicates();
    }

    public RemoveDuplicatesTest(int[] nums, int expectedResult) {
        this.nums = nums;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> arrays() {
        return Arrays.asList(new Object[][] {
            {new int[] {0,0,1,1,1,2,2,3,3,4}, 9},
            {new int[] {1, 1, 2}, 3},
            {new int[] {1, 1, 1, 1}, 2},
            {new int[] {1, 2, 3, 4}, 4},
            {new int[] {1}, 1},
            {new int[] {1,1,1,2,2,2,3,3,3,4,4,4}, 8}
        });
    }

    @Test
    public void testRemoveDuplicates()
    {
        assertEquals(expectedResult, app.removeDuplicates(nums));
    }
}
