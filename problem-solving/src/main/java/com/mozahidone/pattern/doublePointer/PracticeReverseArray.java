package com.mozahidone.pattern.doublePointer;

public class PracticeReverseArray {

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4};
        reverse(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static int[] reverse(int[] nums) {
        int start = 0, end = nums.length -1, temp;
        while (start < end) {
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        return nums;
    }
}
