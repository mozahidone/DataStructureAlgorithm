package com.mozahidone.pattern.numberProblem;

/*
Find the second largest number: Write a function that takes an array of integers as input and
returns the second largest element in the array.
 */
public class SecondLargestNumber {

    public static void main(String[] args) {
        int[] numbers = {11, 2, 33, 4, 55, 88};
        System.out.println(check(numbers));
    }

    public static int check(int[] numbers) {
        if (numbers.length == 0)
            return -1;
        int largest = numbers[0], secondLargest = largest;
        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i] > largest) {
                secondLargest = largest;
                largest = numbers[i];
            } else if (numbers[i] > secondLargest) {
                secondLargest = numbers[i];
            }
        }
        return secondLargest;
    }
}
