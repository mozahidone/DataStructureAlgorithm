package com.mozahidone.array.problem;

public class SearchArray {

    public static void main(String[] args) {
        int[] data = {11,2,33,4,55,6};
        int key = 33;
        System.out.println(search(data, key));
    }

    private static boolean search(int[] data, int key) {
        for (int item: data){
            if(item == key) {
                return true;
            }
        }
        return false;
    }
}
