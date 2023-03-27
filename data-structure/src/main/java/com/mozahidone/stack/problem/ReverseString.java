package com.mozahidone.stack.problem;

import java.util.Stack;

public class ReverseString {

    public static void main(String[] args) {
        System.out.println(reverse("abcdef"));
        System.out.println(reverse("dcba"));
    }

    public static String reverse(String input) {
        StringBuilder output = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        char[] arr = input.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }

        while (!stack.isEmpty()) {
            output.append(stack.pop());
        }
        return output.toString();
    }
}
