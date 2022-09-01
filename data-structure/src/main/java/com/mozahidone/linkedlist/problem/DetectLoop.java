package com.mozahidone.linkedlist.problem;

public class DetectLoop {

    static class Node{
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

public static void main(String[] args) {
    Node head = new Node(1);
    Node a = new Node(2);
    Node b = new Node(3);
    Node c = new Node(4);
    Node d = new Node(5);

    head.next = a;
    a.next = b;
    b.next = c;
    c.next = d;

    print(head);
    d.next = head;
    System.out.println(detectLoop(head));
}

    static void print(Node head) {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    static boolean detectLoop(Node head) {
        if(head == null)
            return false;
        Node fast = head, slow = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow)
                return true;
        }
        return false;
    }
}
