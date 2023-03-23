package com.mozahidone.pattern.numberProblem;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(fibonacci(1));
        System.out.println(fibonacci(2));
        System.out.println(fibonacci(3));
        System.out.println(fibonacci(4));
        System.out.println(fibonacci(5));
    }

    public static int fibonacci(int n) {
        int previous1 = 0, previous2 = 1, sum = 0;
        if (n == 1)
            return previous1;
        else if (n == 2) {
            return previous2;
        }
        for (int i = 3; i <= n; i++) {
            sum = previous1 + previous2;
            previous1 = previous2;
            previous2 = sum;
        }
        return sum;
    }
}
