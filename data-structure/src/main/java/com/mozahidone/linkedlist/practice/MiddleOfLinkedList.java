package com.mozahidone.linkedlist.practice;

public class MiddleOfLinkedList {

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
        //reverse();
        //print();
        System.out.println(middle(head));
    }

    static int middle(Node head) {
        if(head == null)
            return -1;
        Node fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow.data;
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
