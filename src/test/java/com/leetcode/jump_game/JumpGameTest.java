package com.leetcode.jump_game;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class JumpGameTest {
    private int[] nums;
    private boolean expectedResult;
    private JumpGame app;

    @Before
    public void initialize() {
        app = new JumpGame();
    }

    public JumpGameTest(int[] nums, boolean expectedResult) {
        this.nums = nums;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection<Object []> arrays() {
        return Arrays.asList(new Object[][] {
            {new int[] {2, 3, 1, 1, 4}, true},
            {new int[] {3, 2, 1, 0, 4}, false},
            {new int[] {1, 1, 2, 2, 0, 1, 1}, true},
            {new int[] {0}, true},
            {new int[] {0, 1}, false},
            {new int[] {1, 0}, true},
        });
    }

    @Test
    public void testCanJump()
    {
        assertEquals(expectedResult, app.canJump(nums));
    }
}
