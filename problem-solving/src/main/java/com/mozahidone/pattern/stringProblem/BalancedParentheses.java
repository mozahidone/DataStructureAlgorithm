package com.mozahidone.pattern.stringProblem;

import java.util.Stack;

public class BalancedParentheses {
    public static void main(String[] args) {
        System.out.println(check("[{()()}]"));
        System.out.println(check("[[{()()}]]"));
        System.out.println(check("[{()()}"));
        System.out.println(check("{()()}]"));
    }

    public static boolean check(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            if(c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
