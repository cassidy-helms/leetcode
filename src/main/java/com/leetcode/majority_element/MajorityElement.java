package com.leetcode.majority_element;

import java.util.Arrays;

/*
 * Practice Problem 169: Majority Element
 * URL: https://leetcode.com/problems/majority-element/
 */
public class MajorityElement {
    public static void main(String[] args) {
        MajorityElement app = new MajorityElement();
        int[] nums = {2,2,1,1,1,2,2};

        System.out.println(app.majorElement(nums));
    }

    // my solution if I don't need to manually sort
    public int majorityElementSimplest(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    /* not my solution
    * Solution source - https://leetcode.com/problems/majority-element/discuss/51613/O(n)-time-O(1)-space-fastest-solution
    * Deep Diving into Boyer-Moore Majority Vote Algorithm
    * O(N) time and O(1) space
    * 
    * Explanation:
    * 1. For the first iteration, we assume the first element is the majority element and set the count to 1
    * 2. If the next element is the same as the current element, we increment the count
    * 3. If the next element is different from the current element, we decrement the count
    * 4. If the count is 0, we assume the next element is the majority element and set the count to 1  
    * 5. The majority element will always be the last element that sets the count to 1
    *
    * The last statement is true, because any time the count is decremented to 0, the current element is equal to the count of other elements, which cannot be true for the majority element
    * Note: that does not mean that element has forever been discard as the majority element.  Only for the present moment.  We cannot know the majority element until we have iterated over the entire array.
    */
    public int majorElement(int[] nums) {
        int element = 0;
        int count = 0;

        for(int i = 0; i < nums.length; i++) {
            if(count == 0) {
                element = nums[i];
                count = 1;
            } else if(element == nums[i]) {
                count++;
            } else {
                count--;
            }
        }

        return element;
    }
}
