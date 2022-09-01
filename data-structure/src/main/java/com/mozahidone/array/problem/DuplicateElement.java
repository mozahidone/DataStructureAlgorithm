package com.mozahidone.array.problem;

public class DuplicateElement {

    public static void main(String[] args) {
        int[] data = {2,2,2,4};

        int previous = -1;
        for (int i =0; i < data.length; i++) {
            if(data[i] == previous)
                System.out.println("Duplicate found:" + data[i]);
            previous = data[i];
        }
    }
}
