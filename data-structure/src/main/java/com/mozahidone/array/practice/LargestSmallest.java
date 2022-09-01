package com.mozahidone.array.practice;

public class LargestSmallest {

    public static void main(String[] args) {
        int[] data = {22,3,44,77,333,9};

        int smallest=data[0], largest = data[0];

        for (int i =0; i < data.length; i++) {
            if(data[i] < smallest)
                smallest = data[i];

            if(data[i] > largest)
                largest = data[i];
        }
        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);
    }

}
