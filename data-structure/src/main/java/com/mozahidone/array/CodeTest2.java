package com.mozahidone.array;

// Find the first non repeating character

public class CodeTest2 {

    public static void main(String[] args) {
        CodeTest2 codeTest2 = new CodeTest2();
        System.out.println(codeTest2.firstNonRepatingCharacter("aabccbded"));
    }

    private char firstNonRepatingCharacter(String s) {
        for(int i = 0; i < s.length(); i++) {
            boolean duplicateSeen = false;
            for (int j = 0; j < s.length(); j++) {
                if(s.charAt(i) == s.charAt(j) && i != j) {
                    duplicateSeen = true;
                    break;
                }
            }
            if(!duplicateSeen)
                return s.charAt(i);
        }
        return '_';
    }
}
