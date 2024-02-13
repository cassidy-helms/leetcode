package com.leetcode.merge_sorted_array;

public class MergeSortedArray 
{
    public static void main( String[] args )
    {
        MergeSortedArray app = new MergeSortedArray();
        int[] nums1 = { 6, 4, 3, 0, 0, 0 };
        int[] nums2 = { 1, 3, 5 };

        app.merge(nums1, 3, nums2, 3);
        
        for(int i : nums1) {
            System.out.print(i + " ");
        }
    }

    // assumes nums1 and nums2 are sorted
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        // location of max value in nums1
        int i = m - 1;

        // locaton of max value in nums2
        int j = n - 1;

        // number of iterations to go over complete nums1 (size of nums1 + size of nums2 - 1)
        // aka pointer for the total array of nums1
        int k = m + n - 1;

        // loop until iterated over nums2
        // since we are consolidating into nums1, we can stop once we have completely exhausted nums2
        while(j >= 0) {
            // if i >= 0 --> if i contains values and still has values to compare
            // nums1[i] > nums2[j] --> if the value at the pointer for nums2 is less than the value at the pointer for nums1
            if(i >= 0 && nums1[i] > nums2[j]) {
                // update total nums1 pointer (k) to be the greater value (nums1[i])
                // decrement both pointers - we have found the remaining max value and placed it at the correct location of nums1
                nums1[k--] = nums1[i--];
            // nums1[i] < nums2[j] --> if the value at the pointer for nums2 is greater than the value at the pointer for nums1
            } else {
                // update total nums1 pointer (k) to be the greater value (nums2[j])
                // decrement both pointers - we have found the remaining max value and placed it at the correct location of nums1
                nums1[k--] = nums2[j--];
            }
        }

        return nums1;
    }
}
