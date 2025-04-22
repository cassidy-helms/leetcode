package com.leetcode.recursion;

public class BinarySearch {
    public int binarySearch(int[] nums, int target) {
        if(nums.length == 0) return -1;

        return search(nums, target, 0, nums.length - 1);
    }

    public int search(int[] nums, int target, int low, int high) {
        if(low > high) return -1;

        int mid = low + (high - low) / 2;

        if(nums[mid] == target) return mid;

        if(nums[mid] < target) return search(nums, target, mid + 1, high);
        else return search(nums, target, low, mid - 1);
    }
}
