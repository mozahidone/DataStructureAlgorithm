package com.mozahidone.pattern.stringProblem;

public class Substring {

    public static void main(String[] args) {
        System.out.println(isSubstring("ab", "abcd"));
    }

    public static boolean isSubstring(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        for (int i = 0; i <= m - n; i++) {
            int j;
            for (j = 0; j < n; j++) {
                if (str2.charAt(i + j) != str1.charAt(j)) {
                    break;
                }
            }
            if (j == n) {
                return true;
            }
        }
        return false;
    }
}
