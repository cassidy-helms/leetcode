package com.leetcode.remove_duplicates;

/*
 * Practice Problem 26: Remove Duplicates from Sorted Array
 * Url: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        RemoveDuplicates app = new RemoveDuplicates();
        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        System.out.println(app.removeDuplicates(nums));
        for(int i : nums) {
            System.out.print(i + " ");
        }
    }

    public int removeDuplicates(int[] nums) {
        int step = 1;

        for(int i = 1; i < nums.length; i++) {
            if(nums[i-1] != nums[i]) {
                nums[step] = nums[i];
                step++;
            }
        }

        return step;
    }
}
