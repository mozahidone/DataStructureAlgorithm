package com.mozahidone.pattern.stringProblem;

public class Anagram {

    public static void main(String[] args) {
        System.out.println(check("abc", "cba"));
        System.out.println(check("abc", "aba"));
    }

    public static boolean check(String s1, String s2) {
        if(s1 == null || s2 == null)
            return false;
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        if(arr1.length != arr2.length)
            return false;
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] != arr2[arr1.length -1 - i])
                return false;
        }
        return true;

    }
}
