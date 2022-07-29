package com.mozahidone.array.codeTest;

public class Test3 {
    //Least frequent element in an array
    public static void main(String[] args) {
        int[] numbers = {5,5,6,6,3,3};
        System.out.println(findLeastFrequentNumber(numbers));
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
}
