package com.mozahidone.numberProblem;

public class DigitSum {

    public static void main(String[] args) {
        int num = 1234;
        System.out.println(digitSum(num));
    }

    private static int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            int mod = num % 10;
            sum = sum + mod;
            num = num / 10;
        }
        return sum;
    }
}
