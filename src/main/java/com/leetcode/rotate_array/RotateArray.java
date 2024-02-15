package com.leetcode.rotate_array;

/*
 * Practice Problem 189: Rotate Array
 * URL: https://leetcode.com/problems/rotate-array/
 */
public class RotateArray {
    public static void main(String[] args) {
        System.out.println(2 % 4);
    }

    // my solution - in place
    public void rotate(int[] nums, int k) {
        int numsAssigned = 0;
        int numHolder = nums[0];
        int location = 0;
        int startingLocation = 0;
        
        while(numsAssigned < nums.length) {
            int newLocation = (location + k) % nums.length;

            int tempNum = nums[newLocation];
            nums[newLocation] = numHolder;
            numHolder = tempNum;
            location = newLocation;

            if(location == startingLocation) {
                if(location != nums.length - 1) {
                    location++;
                } else {
                    location = 0;
                }
                startingLocation = location;
                numHolder = nums[location];
            }
            numsAssigned++;
        }
    }

    /* not my solution - optimal solution for in-place
    * Solution Source - https://leetcode.com/problems/rotate-array/solutions/1730142/java-c-python-a-very-very-well-detailed-explanation
    *
    * Explanation:
    * 1. Divide the array into two parts: the first nums.length - k elements and the last k elements.
    *    If k is greater than nums.length, then we modulo k with nums.length to get the actual k.
    * 2. Reverse the first part.
    * 3. Reverse the second part.
    * 4. Reverse the entire array.
    *
    * Let's look at an example - nums = [1, 2, 3, 4, 5, 6, 7], k = 3
    * We want to end up with [5, 6, 7, 1, 2, 3, 4]
    * The new last element is the kth + 1 element from the end of the array (4) and the new first element is the kth element from the end of the array (5)
    * Since the ordering of the array is shifting, we now want the current first element (1) and the current last element (7) to be next to each other
    * To accomplish all of this, we can split the array between the new last element (4) and the new first element (5)
    * Reverse both parts so that the 1 and 7 are now next to each other.  This gets the arary in the proper format, but now the 4 is at the beginning and the 5 is at the end!  We want the opposite of that.
    * So we reverse the entire array to get the proper order
    */
    public void rotateOptimal(int[] nums, int k) {
        k = k % nums.length;

        if(k < 0) {
            k += nums.length;
        }

        reverse(nums, 0, nums.length - k - 1);
        reverse(nums, nums.length - k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);
    }

    // reverses the array from i to j
    // ie. reverse([1,2,3,4,5,6,7], 0, 2) --> [3,2,1,4,5,6,7]
    private void reverse(int[] nums, int i, int j) {
        while(i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}
