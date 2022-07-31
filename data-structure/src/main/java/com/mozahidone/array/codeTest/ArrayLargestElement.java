package com.mozahidone.array.codeTest;

// Finding the Largest Element in an Array
public class ArrayLargestElement {
    public static void main(String[] args) {
        int[] numbers = {222,11,999,22,4,66,99};
        System.out.println(findLargestElement(numbers));
    }

    public static int findLargestElement(int[] numbers) {
        int largestElement = -1;
        for(int i=0; i<numbers.length; i++) {
            int currentNumber = numbers[i];
            if(currentNumber > largestElement)
                largestElement = currentNumber;
        }
        return largestElement;
    }
}
