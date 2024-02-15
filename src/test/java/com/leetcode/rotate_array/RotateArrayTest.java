package com.leetcode.rotate_array;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class RotateArrayTest {
    RotateArray rotateArray = new RotateArray();

    @Test
    public void testRotateHappyPathOdd() {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int[] expectedResult = new int[] {5, 6, 7, 1, 2, 3, 4};
        rotateArray.rotate(nums, k);
        assertArrayEquals(expectedResult, nums);
    }

    @Test
    public void testRotateOptimalHappyPathOdd() {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int[] expectedResult = new int[] {5, 6, 7, 1, 2, 3, 4};
        rotateArray.rotateOptimal(nums, k);
        assertArrayEquals(expectedResult, nums);
    }

    @Test
    public void testRotateHappyPathEven() {
        int[] nums = new int[] {-1,-100,3,99};
        int k = 2;
        int[] expectedResult = new int[] {3,99,-1,-100};
        rotateArray.rotate(nums, k);
        assertArrayEquals(expectedResult, nums);
    }

    @Test
    public void testRotateOptimalHappyPathEven() {
        int[] nums = new int[] {-1,-100,3,99};
        int k = 2;
        int[] expectedResult = new int[] {3,99,-1,-100};
        rotateArray.rotateOptimal(nums, k);
        assertArrayEquals(expectedResult, nums);
    }

    @Test
    public void testRotateLength1() {
        int[] nums = new int[] {1};
        int k = 2;
        int[] expectedResult = new int[] {1};
        rotateArray.rotate(nums, k);
        assertArrayEquals(expectedResult, nums);
    }

    @Test
    public void testRotateOptimalLength1() {
        int[] nums = new int[] {1};
        int k = 2;
        int[] expectedResult = new int[] {1};
        rotateArray.rotateOptimal(nums, k);
        assertArrayEquals(expectedResult, nums);
    }

    @Test
    public void testRotate0() {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6, 7};
        int k = 0;
        int[] expectedResult = new int[] {1, 2, 3, 4, 5, 6, 7};
        rotateArray.rotate(nums, k);
        assertArrayEquals(expectedResult, nums);
    }

    @Test
    public void testRotateOptimal0() {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6, 7};
        int k = 0;
        int[] expectedResult = new int[] {1, 2, 3, 4, 5, 6, 7};
        rotateArray.rotateOptimal(nums, k);
        assertArrayEquals(expectedResult, nums);
    }
    
    @Test
    public void testRotateMoreThanMaxLength() {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6, 7};
        int k = 25;
        int[] expectedResult = new int[] {4, 5, 6, 7, 1, 2, 3};
        rotateArray.rotate(nums, k);
        assertArrayEquals(expectedResult, nums);
    }

    @Test
    public void testRotateOptimalMoreThanMaxLength() {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6, 7};
        int k = 25;
        int[] expectedResult = new int[] {4, 5, 6, 7, 1, 2, 3};
        rotateArray.rotateOptimal(nums, k);
        assertArrayEquals(expectedResult, nums);
    }
}