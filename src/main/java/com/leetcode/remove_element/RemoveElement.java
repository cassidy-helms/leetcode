package com.leetcode.remove_element;

/*
 * Practice Problem 27: Remove Element
 * Url: https://leetcode.com/problems/remove-element/
 */
public class RemoveElement {
    public static void main(String[] args) {
        RemoveElement app = new RemoveElement();
        int[] nums = {3, 1, 2, 3};
        int val = 3;

        System.out.println(app.removeElement(nums, val));
        for(int i : nums) {
            System.out.print(i + " ");
        }
    }

    public int removeElement(int[] nums, int val) {
        int step = 0;
        int end = nums.length;

        while(step < end) {
            if(nums[step] == val) {
                for(int j = step; j < nums.length - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                end--;
            } else {
                step++;
            }
        }

        return end;
    }
}
