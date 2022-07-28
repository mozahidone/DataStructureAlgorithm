package com.mozahidone.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addLast(10);
        linkedList.addLast(20);
        linkedList.addLast(30);
        linkedList.addFirst(5);

        System.out.println("Index of 10:" + linkedList.indexOf(10));
        System.out.println("Contains 10?:" + linkedList.contains(10));

        linkedList.removeFirst();
        linkedList.removeLast();
    }
}
