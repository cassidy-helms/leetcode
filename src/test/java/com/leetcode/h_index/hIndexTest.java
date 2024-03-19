package com.leetcode.h_index;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class hIndexTest {
    private int[] citations;
    private int expectedResult;
    private hIndex app;

    @Before
    public void initialize() {
        app = new hIndex();
    }

    public hIndexTest(int[] citations, int expectedResult) {
        this.citations = citations;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> arrays() {
        return Arrays.asList(new Object[][] {
            {new int[] {3, 0, 6, 1, 5}, 3},
            {new int[] {1, 3, 1}, 1},
            {new int[] {1, 15, 3, 4}, 3},
            {new int[] {100}, 1},
            {new int[] {0, 1}, 1},
            {new int[] {0}, 0}
        });
    }

    @Test
    public void testCalculatehIndex() {
        assertEquals(expectedResult, app.calculate_hIndex(citations));
    }

    @Test
    public void testCalculateBetterhIndex() {
        assertEquals(expectedResult, app.better_calculate_hIndex(citations));
    }
}
