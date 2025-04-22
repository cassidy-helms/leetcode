package com.leetcode.recursion;

public class ArrayMax {
    public int arrayMax(int[] nums) {
        return max(nums, 0);
    }

    public int max(int[] nums, int index) {
        if(index >= nums.length) return 0;

        return Math.max(nums[index], max(nums, ++index));
    }
}
