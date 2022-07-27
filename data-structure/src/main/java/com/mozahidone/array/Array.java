package com.mozahidone.array;

public class Array {

    private int[] items;
    private int count;

    public Array(int length) {
        items = new int[length];
    }

    public void insert(int item) {
        // If the Array is full, resize it
        if(count == items.length) {
            int[] newItems = new int[count * 2];
            for (int i =0; i < count; i++) {
                newItems[i] = items[i];
            }
            items = newItems;
        }

        items[count++] = item;
    }

    public void removeAt(int index) {
        if(index < 0 || index >= count)
            throw new IllegalArgumentException();
        count--;
        for(int i = index; i < count; i++){
            items[i] = items[i+1];
        }
    }

    public int indexOf(int item) {
        // If the item is found, return index
        // Otherwise return -1
        for(int i = 0; i < count; i++) {
            if(item == items[i])
                return i;
        }
        return -1;
    }

    public void print() {
        for (int i = 0; i < count; i++){
            System.out.println(items[i]);
        }
    }

    public int size() {
        return count;
    }
}
