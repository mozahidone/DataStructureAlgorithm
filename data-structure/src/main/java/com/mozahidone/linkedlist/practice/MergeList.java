package com.mozahidone.linkedlist.practice;

public class MergeList {

    static class Node{
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(3);
        head1.next.next = new Node(5);

        Node head2 = new Node(2);
        head2.next = new Node(4);
        head2.next.next = new Node(6);
        head2.next.next.next = new Node(8);
        head2.next.next.next.next = new Node(9);

        Node head = merge(head1, head2);
        print(head);
    }

    static void print(Node head) {
        if (head == null)
            return;
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    static Node merge(Node head1, Node head2) {
        Node current1 = head1.next; Node current2 = head2;
        Node tail = head1;
        int counter = 0;

        while (current1 != null && current2 != null) {
            if(counter % 2 == 0) {
                tail.next = current2;
                current2 = current2.next;
            } else {
                tail.next = current1;
                current1 = current1.next;
            }
            tail = tail.next;
            counter ++;
        }
        if(current2 == null) {
            tail.next = current1;
        }
        if(current1 == null) {
            tail.next = current2;
        }
        return head1;

    }
}
