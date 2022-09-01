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
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);

        a.next = b;
        b.next = c;
        c.next =d;

        recursivePrint(a);
        //System.out.println(sum(a));
        //System.out.println(getValueAtIndex(null, 5));
        System.out.println(getValueAtIndexUsingRecursion(a, 7));
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
