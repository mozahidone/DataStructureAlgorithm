package com.mozahidone.linkedlist.problem;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.next = new Node(5);

        print(head);
        removeDuplicate(head);
        print(head);
    }

    public static void print(Node head) {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void removeDuplicate(Node head) {
        if (head == null)
            return;
        Set<Integer> seenElements = new HashSet<>();
        seenElements.add(head.data);

        Node current = head.next, previous = head;
        while (current != null) {
            if (seenElements.contains(current.data)) {
                previous.next = current.next;
                current = current.next;
            } else {
                seenElements.add(current.data);
                previous = current;
                current = current.next;
            }
        }
    }
}
