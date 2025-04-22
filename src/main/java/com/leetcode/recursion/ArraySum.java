package com.leetcode.recursion;

/*
 * Inspired by - https://www.geeksforgeeks.org/sum-array-elements-using-recursion/
 */
public class ArraySum {
    public int arraySum(int[] nums) {
        return sum(nums, nums.length);
    }

    public int sum(int[] nums, int length) {
        if(length <= 0) return 0;

        return sum(nums, length - 1) + nums[length - 1];
    }
}
