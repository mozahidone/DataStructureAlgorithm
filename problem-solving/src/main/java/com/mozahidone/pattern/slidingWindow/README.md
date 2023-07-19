# Simple sliding window problem

## Problem:
Given an array of positive integers, find the maximum sum of any contiguous subarray of length k.

Example:
Input: nums = [2, 1, 5, 1, 3, 2], k = 3
Output: 9
Explanation: The contiguous subarray with maximum sum of length 3 is [5, 1, 3], and its sum is 9.

To solve this problem using the sliding window technique, you can use the following Java code:

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
