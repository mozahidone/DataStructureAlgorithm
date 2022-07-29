package com.mozahidone.array.codeTest;

import java.util.HashMap;

public class Test3 {
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
}
