package com.mozahidone.linkedlist.practice;

public class AllTechniques {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    //1 -> 2 -> 3 -> 4 -> 5 -> null
    // 3 4 5
    // 5 4 3
    // 1 -> 5 -> 2 - > 4 -> 3 -> null
    // 1. Divide the link list
    // 2. Reverse the second part
    // 3. Merge the two lists

    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(5);

        print(head1);
        Node head2 = getMiddleNode(head1);
        head2 = reverse(head2);
        merge(head1, head2);
        print(head1);

    }

    static Node merge(Node head1, Node head2) {
        Node tail = head1;
        Node current1 = head1.next, current2 = head2;
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
            counter++;
        }
        if(current1 == null) {
            tail.next = current2;
        }
        if(current2 == null) {
            tail.next = current1;
        }

        return head1;
    }

    static Node reverse(Node head) {
        if (head == null)
            return null;
        Node current = head, previous = null, next;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }
    static Node getMiddleNode(Node head) {
        if (head == null)
            return null;
        Node fast = head, slow = head, previous = null;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            previous = slow;
            slow = slow.next;
        }
        if(previous != null)
            previous.next = null;
        return slow;
    }
    static void print(Node head) {
        if(head == null)
            return;
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
