package code_challenges.leetcode;

import java.util.HashMap;
import java.util.Map;

public class challenge1 {

	// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
	// You may assume that each input would have exactly one solution, and you may not use the same element twice.
	// You can return the answer in any order.
	
    public int[] firstSolution(int[] nums, int target) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                sum = nums[i] + nums[j];
                if (sum == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{0,0};
    }
    
    public int[] optimizedSolution(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            Integer complement = target - nums[i];
            if(numMap.containsKey(complement)){
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }
        return new int[]{};
    }
	
}
