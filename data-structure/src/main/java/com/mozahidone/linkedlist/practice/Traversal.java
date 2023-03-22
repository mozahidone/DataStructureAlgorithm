package com.mozahidone.linkedlist.practice;

public class Traversal {

    static class Node{
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }
    static void print(Node head) {
        Node current = head;
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }
    }

    static void recursivePrint(Node head) {
        if(head == null)
            return;
        System.out.println(head.val);
        recursivePrint(head.next);
    }

    public static void main(String[] args) {
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(3);
        node.next.next.next =new Node(4);
        node.next.next.next.next =new Node(5);

        //recursivePrint(node);
        iterativePrint(node);
        node = reverse(node);
        iterativePrint(node);
        //System.out.println(sum(a));
        //System.out.println(getValueAtIndex(null, 5));
        //System.out.println(getValueAtIndexUsingRecursion(node, 7));
    }

    public static Node reverse(Node head) {
        Node previous = null, current = head, next = null;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
        return head;
    }
    public static void recursion(Node head) {
        if (head == null)
            return;
        System.out.println(head.val);
        recursion(head.next);
    }

    public static void iterativePrint(Node head) {
        Node current = head;
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }
    }

    static int sum(Node head) {
        if (head == null)
            return 0;
        return head.val + sum(head.next);
    }

    static int getValueAtIndex(Node head, int index) {
        Node current = head;
        int counter = 0;
        while (current != null) {
            if(counter == index)
                return current.val;
            current = current.next;
            counter++;
        }
        return -1;
    }

    static int getValueAtIndexUsingRecursion(Node head, int index) {
        if(head == null)
            return -1;
        if( index == 0)
            return head.val;
        return getValueAtIndexUsingRecursion(head.next, index-1);
    }
}
