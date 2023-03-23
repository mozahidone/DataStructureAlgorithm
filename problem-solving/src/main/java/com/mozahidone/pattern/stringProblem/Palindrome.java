package com.mozahidone.pattern.stringProblem;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(palindrome("abcba"));
        System.out.println(palindrome("abcbae"));
        System.out.println(palindrome(""));
        System.out.println(palindrome(null));
    }

    public static boolean palindrome(String input) {
        if(input == null)
            return false;
        char[] arr = input.toCharArray();
        if(arr.length == 0)
            return false;
        int start = 0, end = arr.length - 1;
        while (start < end) {
            if (arr[start] != arr[end])
                return false;
            start++;
            end--;
        }
        return true;
    }
}
