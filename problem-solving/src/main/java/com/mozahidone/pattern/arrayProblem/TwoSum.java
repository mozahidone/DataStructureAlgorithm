package com.mozahidone.pattern.arrayProblem;

public class TwoSum {

    public static void main(String[] args) {
        int[] numbers = {2, 7, 6, 11, 13};
        int target = 24;
        System.out.println(bruteForce(numbers, target));
    }

    public static int[] bruteForce(int[] numbers, int target) {
        int[] result = {-1, -1};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}
