package com.mozahidone.pattern.slidingWindow;

public class MaximumSum {

    public static void main(String[] args) {
        int[] nums = {2, 1, 5, 1, 3, 2}; int k = 3;
        System.out.println(maxSumSubarray(nums, k));
    }

    public static int maxSumSubarray(int[] nums, int k) {
        int maxSum = 0;
        int windowSum = 0;

        // Calculate the initial sum of the first k elements to initialize the window
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        maxSum = windowSum;

        // Slide the window through the array and update the sum accordingly
        for (int i = k; i < nums.length; i++) {
            windowSum = windowSum - nums[i - k] + nums[i];

            // Update the maximum sum if the current window sum is greater
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }
}
