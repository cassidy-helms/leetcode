package com.leetcode.remove_duplicates_max_two;

/*
 * Practice Problem 80: Remove Duplicates from Sorted Array II
 * Url: https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        RemoveDuplicates app = new RemoveDuplicates();
        int[] nums = {1,1,1,1};

        System.out.println(app.removeDuplicates(nums));
        for(int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();

        int[] nums2 = {1,1,1,2,2,3};
        System.out.println(app.removeDuplicates(nums2));
        for(int i : nums2) {
            System.out.print(i + " ");
        }
    }

    public int removeDuplicates(int[] nums) {
        if(nums.length <= 2) return nums.length;

        int step = 2;

        for(int i = 2; i < nums.length; i++) {
            if(nums[step-2] != nums[i]) {
                nums[step] = nums[i];
                step++;
            }
        }

        return step;
    } 
}
