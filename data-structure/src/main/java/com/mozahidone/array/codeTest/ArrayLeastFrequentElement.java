package com.mozahidone.array.codeTest;

import java.util.HashMap;

public class ArrayLeastFrequentElement {
    //Least frequent element in an array
    public static void main(String[] args) {
        int[] numbers = {11,5,5,6,6,3,3};
        System.out.println(findLeastFrequestNumber_HashMap(numbers));
    }

    public static int findLeastFrequentNumber(int[] numbers) {
        int leastNumber = -1, leastFrequency = numbers.length;

        for(int i=0; i<numbers.length; i++) {
            int frequency = 0;
            for (int j=0; j<numbers.length; j++) {
                if(numbers[i] == numbers[j])
                    frequency++;
            }
            if(frequency < leastFrequency) {
                leastFrequency = frequency;
                leastNumber = numbers[i];
            }

        }
        return leastNumber;
    }

    public static int findLeastFrequestNumber_HashMap(int[] numbers) {
        int leastNumber = -1, leastFrequency = numbers.length;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i=0; i<numbers.length; i++) {
            if(hashMap.containsKey(numbers[i]))
                hashMap.put(numbers[i], hashMap.get(numbers[i]) + 1);
            else
                hashMap.put(numbers[i], 1);
        }
        for (int i=0; i<numbers.length; i++) {
            int frequency = hashMap.get(numbers[i]);
            if(frequency < leastFrequency) {
                leastFrequency = frequency;
                leastNumber = numbers[i];
            }
        }
        return leastNumber;
    }

    public static class ArraySmallestLargest {

        public static void main(String[] args) {
            int[] nummbers = {10, 3, 22, 5, 99, 7};
            int smallest = nummbers[0], largest = nummbers[0];

            for (int number: nummbers) {
                if (number > largest)
                    largest = number;
                else if (number < smallest)
                    smallest = number;
            }

            System.out.println("Smallest: " + smallest + ", Largest: " + largest);
        }
    }

    public static class FirstNonRepeatingCharacter {

        public static void main(String[] args) {
            FirstNonRepeatingCharacter codeTest2 = new FirstNonRepeatingCharacter();
            System.out.println(codeTest2.libraryFunctionImplementation("aabccbdedeg"));
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

        private char libraryFunctionImplementation(String s) {
            for(int i=0; i<s.length(); i++) {
                char c = s.charAt(i);
                if(s.indexOf(c) == s.lastIndexOf(c))
                    return c;
            }
            return '_';
        }

    }
}
