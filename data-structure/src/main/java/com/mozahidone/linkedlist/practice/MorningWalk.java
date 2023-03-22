package com.mozahidone.linkedlist.practice;

public class MorningWalk {
    static Node head = null;
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static void main(String[] args) {
        addBeforeFirstNode(10);
        addAfterLastNode(1);
        addAfterLastNode(2);
        addAfterLastNode(3);
        //print();
        addBeforeFirstNode(20);
        print();
    }

    public static void addBeforeFirstNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public static void addAfterLastNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        } else if (head.next == null) { // check the first node
            head.next = newNode;
            return;
        }
        Node currentNode = head;
        while (currentNode.next != null ) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    public static void removeFirstNode() {
        if (head == null) {
            return;
        } else {
            head = head.next;
        }
    }

    public static void removeLastNode(int data) {
        if (head == null) {
            return;
        } else if (head.next == null) {
            head = null;
            return;
        } else {
            Node currentNode = head;
            while (currentNode.next.next != null ) {
                currentNode = currentNode.next;
            }
            currentNode.next = null;
        }
    }

    public static void print() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static boolean searchNode(int data) {
        if (head == null)
            return false;
        Node currentNode = head;
        while (currentNode != null) {
            if(currentNode.data == data)
                return true;
            currentNode = currentNode.next;
        }
        return false;
    }

    public static void remove(Node nodeToBeDeleted) {
        if (head == null)
            return;
        else if (head == nodeToBeDeleted) { // check the first node
            head = head.next;
            return;
        }
        Node currentNode = head;
        while (currentNode.next != null) {
            if (currentNode.next == nodeToBeDeleted) {
                currentNode.next = currentNode.next.next;
                return;
            }
            currentNode = currentNode.next;
        }
    }

}