package com.mozahidone.pattern.numberProblem;

public class SumOfMultiples {

    public static void main(String[] args) {
        System.out.println(sum(3, 5));
    }

    public static int sum(int number, int count) {
        int sum = 0;
        for (int i = 1; i <= count; i++) {
            sum = sum + number*i;
        }
        return sum;
    }
}
