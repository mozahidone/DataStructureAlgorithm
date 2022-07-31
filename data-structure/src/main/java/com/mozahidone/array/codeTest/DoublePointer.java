package com.mozahidone.array.codeTest;

import java.util.Arrays;

// Reverse an array
public class DoublePointer {
    public static void main(String[] args) {
        int[] numbers = {5,3,6,4,8,9};
        System.out.println(Arrays.toString(reverseArray(numbers)));
    }

    public static int[] reverseArray(int[] numbers) {
        int i=0, j=numbers.length-1, temp;
        while(i < j) {
            temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
            i++;
            j--;
        }
        return numbers;
    }
}
