package com.mozahidone.array;

// Find the first non repeating character

import java.util.HashMap;

public class CodeTest2 {

    public static void main(String[] args) {
        CodeTest2 codeTest2 = new CodeTest2();
        System.out.println(codeTest2.intArrayImplementation("aabccbded"));
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

    private char firstNonRepatingCharacterHashMap(String s) {
        HashMap<Character, Integer> characterCount = new HashMap<>();
        for(int i=0; i<s.length(); i++) {
            if(characterCount.containsKey(s.charAt(i))) {
                characterCount.put(s.charAt(i), characterCount.get(s.charAt(i)) + 1);
            } else {
                characterCount.put(s.charAt(i), 1);
            }
        }
        for (int i=0; i<s.length(); i++) {
            if(characterCount.get(s.charAt(i)) == 1) {
                return s.charAt(i);
            }
        }
        return '_';
    }

    private char intArrayImplementation(String s) {
        int[] intArray = new int[26];

        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            intArray[c-'a'] = intArray[c-'a'] + 1;
        }

        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(intArray[c-'a'] == 1)
                return c;
        }
        return '_';
    }

}
