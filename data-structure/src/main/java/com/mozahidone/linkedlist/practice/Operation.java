package com.mozahidone.linkedlist.practice;

public class Operation {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node head;
    static Node tail;

    public static void main(String[] args) {
        addToTheBeginning(1);
        addToTheBeginning(10);
        addToTheBeginning(100);
        addToTheEnd(2);
        addToTheEnd(20);
        print();
        //deleteFromBeginning();
        deleteFromEnd();
        print();
    }

    public static void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void addToTheBeginning(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            tail = newNode;
        } else {
            Node temp = head;
            newNode.next = temp;
            head = newNode;
            temp = null;
        }

    }

    public static void addToTheEnd(int data) {
        Node newNode = new Node(data);
        if(tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

    }

    public static void deleteFromBeginning() {
        if (head == null)
            return;
        else {
            Node temp = head;
            head = head.next;
            temp = null;
        }
    }

    public static void deleteFromEnd() {
        if (tail == null)
            return;
        else {
            Node nodeBeforeTheLast = getPreviousNode();

            nodeBeforeTheLast.next = null;
            tail = nodeBeforeTheLast;
        }
    }

    private static Node getPreviousNode() {
        if (head == null)
            return null;
        Node current = head;
        while (current != null) {
            if (current.next == tail)
                return current;
            current = current.next;

        }
        return null;
    }
}
