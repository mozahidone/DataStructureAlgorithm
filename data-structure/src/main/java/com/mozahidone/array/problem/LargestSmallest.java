package com.mozahidone.array.problem;

// Find out smallest and largest number in a given array.

public class LargestSmallest {

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
