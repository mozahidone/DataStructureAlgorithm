package com.mozahidone.stack.problem;

import java.util.Stack;

public class ReverseLinkedList {

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
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        traverse(head);
        reverse(head);
        traverse(head);
    }

    public static void reverse(Node head) {
        Stack<Node> stack = new Stack<>();
        Node current = head;
        while (current != null) {
            stack.push(current);
            current = current.next;
        }
        Node previous = stack.pop();
        head = previous;

        while (!stack.isEmpty()) {
            current = stack.pop();
            previous.next = current;
            previous = current;
        }
        current.next = null;
    }
    public static void traverse(Node head) {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
