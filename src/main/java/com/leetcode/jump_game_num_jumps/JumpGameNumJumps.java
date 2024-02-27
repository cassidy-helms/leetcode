package com.leetcode.jump_game_num_jumps;

/*
 * Practice Problem 45: Jump Game II
 * URL: https://leetcode.com/problems/jump-game-ii/
 */
public class JumpGameNumJumps {
    public static void main(String[] args) {
        JumpGameNumJumps jumpGameNumJumps = new JumpGameNumJumps();
        int[] nums = {7, 0, 9, 6, 9, 6, 1, 7, 9, 0, 1, 2, 9, 0, 3};
        System.out.println(jumpGameNumJumps.jumpOptimal(nums));
    }

    // My solution
    // Not the most efficient solution.  I think at worst case, this solution is O(n^2)
    // The idea is that within each step range, we will find the next step that will get us the furthest (i + nums[i])
    // Once we find that step, we will start from that location to find the next step
    // We will keep doing this until we reach the end of the array
    public int jump(int[] nums) {
        if(nums.length <= 1) {
            return 0;
        }

        int numberOfJumps = 0;
        int stepIndex = 0;
        int stepValue = nums[0];
        int potentialStepIndex = 0;
        int potentialStepValue = 0;
        int index = 1;

        if(stepValue >= nums.length - 1) {
            return ++numberOfJumps;
        }

        while(index < nums.length) {
            stepValue--;

            if(index + nums[index] >= potentialStepValue) {
                potentialStepValue = index + nums[index];
                potentialStepIndex = index;
            }

            if(stepValue == 0  || index == nums.length - 1) {
                stepValue = nums[potentialStepIndex];
                stepIndex = potentialStepIndex;
                index = stepIndex + 1;
                potentialStepValue = 0;
                potentialStepIndex = 0;
                numberOfJumps++;

                if(stepIndex + stepValue >= nums.length - 1) {
                    return ++numberOfJumps;
                }
            } else {
                index++;
            }
        }

        return numberOfJumps;
    }


    // Not my solution
    // Solution URL - https://leetcode.com/problems/jump-game-ii/solutions/3158169/clean-codes-full-explanation-implicit-bfs-c-java-python3
    // This solution is O(n)
    // In my solution, I got too hung up on having to return to the step that is jumped to instead of just continuing on looking for the next step
    // since all I really cared about was the step's value and index
    public int jumpOptimal(int[] nums) {
        int ans = 0;
        int end = 0;
        int farthest = 0;
    
        // Implicit BFS
        for (int i = 0; i < nums.length - 1; ++i) {
          farthest = Math.max(farthest, i + nums[i]);
          if (farthest >= nums.length - 1) {
            ++ans;
            break;
          }
          if (i == end) {   // Visited all the items on the current level
            ++ans;          // Increment the level
            end = farthest; // Make the queue size for the next level
          }
        }
    
        return ans;
      }
}
