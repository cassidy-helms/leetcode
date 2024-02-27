package com.leetcode.jump_game_num_jumps;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class JumpGameNumJumpsTest {
    private int[] nums;
    private int expectedResult;
    private JumpGameNumJumps app;

    @Before
    public void initialize() {
        app = new JumpGameNumJumps();
    }

    public JumpGameNumJumpsTest(int[] nums, int expectedResult) {
        this.nums = nums;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> arrays() {
        return Arrays.asList(new Object[][] {
            {new int[] {7, 0, 9, 6, 9, 6, 1, 7, 9, 0, 1, 2, 9, 0, 3}, 2},
            {new int[] {2, 3, 1, 1, 4}, 2},
            {new int[] {2, 3, 0, 1, 4}, 2},
            {new int[] {1, 2, 3}, 2},
            {new int[] {1, 2, 3, 4, 5}, 3},
            {new int[] {1}, 0},
            {new int[] {1, 1, 1, 1}, 3},
        });
    }

    @Test
    public void testJump()
    {
        assert(expectedResult == app.jump(nums));
    }

    @Test
    public void testJumpOptimal()
    {
        assert(expectedResult == app.jumpOptimal(nums));
    }
}
