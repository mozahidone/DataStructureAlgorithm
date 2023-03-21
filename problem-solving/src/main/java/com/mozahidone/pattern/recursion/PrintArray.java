package com.mozahidone.pattern.recursion;

public class PrintArray {

    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5};

        recursiveApproach(data, 0);
    }

    public static void iterativeApproach(int[] data) {
        for(int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public static void recursiveApproach(int[] data, int index) {
        if(data.length == index) {
            System.out.println();
            return;
        }
        System.out.print(data[index] + " ");
        recursiveApproach(data, index+1);
    }
}
