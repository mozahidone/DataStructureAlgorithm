package com.mozahidone.pattern.doublePointer;

import java.util.Arrays;

public class PairTargetSum {

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;

        System.out.println(Arrays.toString(hasPairWithTarget(nums, target)));
    }

    public static int[] hasPairWithTarget(int[] nums, int target) {
        int first = 0, last = nums.length -1;
        int[] result = new int[2];
        while (first < last) {
            if(nums[first] + nums[last] == target) {
                result[0] = first;
                result[1] = last;
                return result;
            } else if (nums[first] + nums[last] < target) {
                first++;
            } else {
                last--;
            }
        }
        return result;
    }

}
