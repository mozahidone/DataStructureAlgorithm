package com.mozahidone.queue;

public class Queue {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node front, rear;

    static void enqueue(int data) {
        Node newNode = new Node(data);
        if(rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    static void dequeue() {
        if(front == null) {
            return;
        }
        front = front.next;
    }

    static void print(Node front) {
        Node current = front;
        while(current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        enqueue(1);
        enqueue(2);
        enqueue(3);
        enqueue(4);
        enqueue(5);
        dequeue();
        print(front);
    }
}
