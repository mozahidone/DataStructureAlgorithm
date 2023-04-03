package com.mozahidone.pattern.stringProblem;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringProblem {
    public static void main(String[] args) {
        String s = "aabbbcdddef";
        System.out.println(firstNonRepeatingCharacter(s));

        System.out.println(removeNonAlphabeticCharacters("@@This is a test string @1234*"));
    }

    /*
    Write a function to find the first occurrence of a non-repeating character in a given string.
     */
    public static Character firstNonRepeatingCharacter(String s) {
        Map<Character, Integer> charCount = new LinkedHashMap<>();

        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (charCount.containsKey(c)) {
                charCount.put(c, charCount.get(c) + 1);
            } else {
                charCount.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> item: charCount.entrySet()) {
            if (item.getValue() == 1)
                return item.getKey();
        }
        return null;
    }

    /*
    Write a function to remove all the non-alphabetic characters from a given string.
     */

    public static String removeNonAlphabeticCharacters(String s) {
        return s.replaceAll("[^a-zA-Z]", "");
    }
}
