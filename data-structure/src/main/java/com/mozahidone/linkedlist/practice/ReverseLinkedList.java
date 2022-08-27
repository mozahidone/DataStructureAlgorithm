package com.mozahidone.linkedlist.practice;

public class ReverseLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node head;

    static void pushNode(int data) {
        Node node = new Node(data);
        if(head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    static void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    //1->2->3->4->5
    //1->null
    //
    public static void main(String[] args) {
        pushNode(1);
        pushNode(2);
        pushNode(3);
        pushNode(4);
        pushNode(5);

        print();
        reverse();
        print();
    }

    public static void reverse() {
        Node current, previous =null, next;
        current = head;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
    }
}
