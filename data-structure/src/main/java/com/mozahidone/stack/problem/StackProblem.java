package com.mozahidone.stack.problem;

import java.util.Stack;

public class StackProblem {

    public static void main(String[] args) {
        System.out.println(checkPalindrome("abcba"));
        System.out.println(checkPalindrome("abcbae"));
    }

    public static boolean checkPalindrome(String input) {
        char[] arr = input.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i=0; i < input.length(); i++) {
            stack.push(arr[i]);
        }
        int counter = 0;
        while (!stack.isEmpty()) {
            if (stack.peek() == arr[counter]) {
                stack.pop();
                counter++;
            } else
                return false;
        }
        return stack.isEmpty();
    }
}
