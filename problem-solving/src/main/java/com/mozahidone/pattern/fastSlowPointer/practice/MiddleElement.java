package com.mozahidone.pattern.fastSlowPointer.practice;

public class MiddleElement {

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
        print(head);
        System.out.println("Middle node:" + printMiddleNode(head));
        deleteMiddleNode(head);
        print(head);
    }

    public static void deleteMiddleNode(Node head) {
        Node slow = head, fast = head, previous = null;
        while (fast.next != null && fast.next.next != null) {
            previous = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        previous.next = slow.next;
    }

    public static int printMiddleNode(Node head) {
        if (head != null) {
            Node slow = head, fast = head;
            while (fast.next != null && fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow.data;
        }
        return -1;
    }

    public static void print(Node head) {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }
}
