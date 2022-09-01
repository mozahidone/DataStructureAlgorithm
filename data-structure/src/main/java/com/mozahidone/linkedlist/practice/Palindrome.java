package com.mozahidone.linkedlist.practice;

public class Palindrome {

    static class Node{
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);

        print(head);

        Node middleNode = getMiddle(head);
        middleNode = reverse(middleNode);
        System.out.println(isPalindrome(head, middleNode));
    }

    static void print(Node head) {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    static Node getMiddle(Node head) {
        if(head == null)
            return null;
        Node fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    static Node reverse(Node head) {
        if(head == null)
            return null;
        Node current = head, prev = null, next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    static boolean isPalindrome(Node head, Node middle) {
        while (middle != null && head.data == middle.data) {
            head = head.next;
            middle = middle.next;
        }
        return middle == null;
    }
}
