package com.mozahidone.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] data = {12,2,4,88,1,6};
        System.out.println(Arrays.toString(sort(data)));
    }

    public static int[] sort(int[] data) {
        for (int i=0; i<data.length; i++) {
            for (int j=0; j<data.length-i-1; j++) {
                if(data[j] > data[j+1]) {
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
        return data;
    }
}
