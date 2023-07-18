package com.mozahidone.pattern.doublePointer.practice;

import java.util.HashMap;
import java.util.Map;

public class PairTargetSum {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50}, indices = {-1, -1};
        //indices = findByTwoPointersApproach(nums, 60);
        indices = findByHashmapApproach(nums, 60);

        System.out.println(indices[0] + " " + indices[1]);
    }

    public static int[] findByHashmapApproach(int[] nums, int target) {
        //int left = 0, right = nums.length - 1, sum = 0;
        int[] indices = {-1, -1};
        Map<Integer, Integer> seenElements = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(seenElements.containsKey(complement)) {
                indices[0] = seenElements.get(complement);
                indices[1] = i;
                return indices;
            } else {
                seenElements.put(nums[i], i);
            }
        }

        return indices;
    }

    public static int[] findByTwoPointersApproach(int[] nums, int target) {
        int left = 0, right = nums.length - 1, sum = 0;
        int[] indices = {-1, -1};

        while (left < right) {
            sum = nums[left] + nums[right];

            if (sum == target) {
                indices[0] = left;
                indices[1] = right;
                return indices;
            } else if (sum < target) {
                left++;
            } else if (sum > target) {
                right--;
            }
        }
        return indices;
    }
}
