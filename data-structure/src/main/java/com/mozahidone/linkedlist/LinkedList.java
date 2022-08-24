package com.mozahidone.linkedlist;

import java.util.NoSuchElementException;

public class LinkedList {

    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;

    public void addLast(int item) {
        Node node = new Node(item);
        if (first == null)
            first = last = node;
        else {
            last.next = node;
            last = node;
        }
    }

    public void pushNode(int data) {
        Node node = new Node(data);
        if (first == null) {
            first = node;
        } else {
            node.next = first;
            first = node;
        }
    }
    public void addFirst(int item) {
        Node node = new Node(item);

        if(first == null) {
            first = last = node;
        } else {
            node.next = first;
            first = node;
        }
    }

    public void traverse() {
        Node temp = first;
        while (temp!=null){
            System.out.println(temp.value);
            temp=temp.next;
        }
    }
    public int indexOf(int value) {
        int index = 0;
        Node current = first;

        while(current != null) {
            if(current.value == value)
                return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    public void removeFirst() {
        //[10->20->30]
        if(first != null) {
            Node secondNode = first.next;
            first.next = null;
            first = secondNode;
        }
    }

    public void removeLast() {
        if(first == null)
            throw new NoSuchElementException();
        if(first == last) {
            first = last = null;
            return;
        }
        Node previousNode = getPreviousNode(last);
        previousNode.next = null;
        last = previousNode;
    }

    private Node getPreviousNode(Node node) {
        Node current = first;
        while (current != null) {
            if(current.next == node)
                return current;
            current = current.next;
        }
        return null;
    }

    public int getLength() {
        int length = 0;
        Node temp = first;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }

    public int getMiddleElement(int length) {
        int midPosition = length/2;
        Node temp = first;
        while (midPosition > 0) {
            midPosition--;
            temp = temp.next;
        }
        return temp.value;
    }

    public void reverse() {
        Node current = first;
        Node prev = null;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        first = prev;
    }
}
