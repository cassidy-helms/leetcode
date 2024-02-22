package com.leetcode.jump_game;

/*
 * Practice Problem 55: Jump Game
 * URL: https://leetcode.com/problems/jump-game/
 */
public class JumpGame {
    public static void main(String[] args) {
        JumpGame jumpGame = new JumpGame();
        int[] nums = {3, 2, 1, 0, 4};
        System.out.println(jumpGame.canJump(nums));
    }

    public boolean canJump(int[] nums) {
        if(nums.length <= 1) {
            return true;
        }

        int currentStep = nums[0];

        for(int i = 0; i < nums.length - 1; i++) {  
            currentStep--;

            if(nums[i] > currentStep) {
                currentStep = nums[i];
            }

            if(currentStep == 0) {
                return false;
            }
        }

        return true;
    }
}
