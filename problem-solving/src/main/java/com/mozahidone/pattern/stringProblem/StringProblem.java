package com.mozahidone.pattern.stringProblem;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringProblem {
    public static void main(String[] args) {
        /*String s = "aabbbcdddef";
        System.out.println(firstNonRepeatingCharacter(s));

        System.out.println(removeNonAlphabeticCharacters("@@This is a test string @1234*"));

        System.out.println(reverse("abcd"));

        capitalizeFirstLetter("This is a hello text.");
        System.out.println(maxOccurringCharacter("aabbbcdd"));
        */

        System.out.println(areAnagrams("listen", "silent"));
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

    /*
    Write a function to reverse a given string
     */
    public static String reverse(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(s.length() -1 - i);
            sb.append(c);
        }
        return sb.toString();
    }

    /*
    Write a function to capitalize the first letter of each word in a given string.
     */
    public static void capitalizeFirstLetter(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String word: words) {
            System.out.println(firstLetter(word));
        }
    }

    public static String firstLetter(String s) {
        char[] arr = s.toCharArray();
        arr[0] = 'A';
        return arr.toString();
    }

    /*
    Write a function to find the maximum occurring character in a given string
     */
    public static Character maxOccurringCharacter(String s) {
        Map<Character, Integer> countMap = new LinkedHashMap<>();
        for(int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (countMap.containsKey(c)) {
                countMap.put(c, countMap.get(c) + 1);
            } else {
                countMap.put(c, 1);
            }
        }
        int maxCount = 0;
        Character maxChar = null;
        for (Map.Entry<Character, Integer> item: countMap.entrySet()) {
            if (item.getValue() > maxCount) {
                maxCount = item.getValue();
                maxChar = item.getKey();
            }
        }
        return maxChar;
    }

    /*
    Write a function to check if two given strings are anagrams.
     */
    public static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        int[] countChar = new int[256];

        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            countChar[c]++;
        }
        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);

            if(countChar[c] == 0)
                return false;
            countChar[c]--;
        }
        return true;
    }
}
