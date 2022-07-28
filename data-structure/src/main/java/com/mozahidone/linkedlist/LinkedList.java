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

    public void addFirst(int item) {
        Node node = new Node(item);

        if(first == null) {
            first = last = node;
        } else {
            node.next = first;
            first = node;
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
}
