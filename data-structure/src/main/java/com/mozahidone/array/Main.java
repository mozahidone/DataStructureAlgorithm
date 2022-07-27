package com.mozahidone.array;

public class Main {

    public static void main(String[] args) {

        Array array = new Array(3);
        array.insert(10); // Insert item
        array.insert(20);
        array.insert(30);
        array.insert(40); // Dynamic array testing
        System.out.println("Array size is: " + array.size());
        array.print();

        array.removeAt(1); // Remove item
        System.out.println("Array size is: " + array.size());
        array.print();

        System.out.println("Index is:" + array.indexOf(10)); // Item index testing
        System.out.println("Index is:" + array.indexOf(80)); // Item index testing
    }
}
