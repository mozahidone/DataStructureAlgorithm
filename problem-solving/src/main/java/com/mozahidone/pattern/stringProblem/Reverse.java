package com.mozahidone.pattern.stringProblem;

public class Reverse {

    public static void main(String[] args) {
        System.out.println(reverse("abcde"));
    }

    public static String reverse(String input) {
        char[] arr = input.toCharArray();
        StringBuilder output = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            output = output.append(arr[i]);
        }
        return output.toString();
    }
}
