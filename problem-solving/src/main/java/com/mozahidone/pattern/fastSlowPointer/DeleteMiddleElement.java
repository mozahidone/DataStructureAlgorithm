package com.mozahidone.pattern.fastSlowPointer;

public class DeleteMiddleElement {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head;

    void pushNode(int data) {
        Node node = new Node(data);
        if(head == null) {
            head = node;
        } else {

        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        deleteMiddleNode(head);
        print(head);
    }

    public static void deleteMiddleNode(Node head) {
        Node fast = head, slow = head; Node prev = null;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }

        prev.next = slow.next;

    }

    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
