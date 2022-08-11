package com.mozahidone.array.codeTest;

public class SortArray {

    public static void main(String[] args) {
        int[] array = {-6,-5,-3,0,2,4};
        System.out.println("Before sort:");
        for (int item:array) {
            System.out.println(item);
        }

        System.out.println("After sort:");
        for (int item:sortArray(array)) {
            System.out.println(item);
        }
    }

    public static int[] sortArray(int[] array) {
        int firstPointer = 0, size = array.length, lastPointer = size -1;
        int result[] = new int[size];

        for (int index = size-1; index >= 0; index--){
            if (Math.abs(array[firstPointer]) > Math.abs(array[lastPointer])) {
                result[index] = array[firstPointer]*array[firstPointer];
                firstPointer++;
            } else {
                result[index] = array[lastPointer]*array[lastPointer];
                lastPointer--;
            }
        }
        return result;
    }
}
