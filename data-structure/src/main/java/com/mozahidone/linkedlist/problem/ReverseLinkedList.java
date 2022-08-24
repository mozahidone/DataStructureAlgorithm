package com.mozahidone.linkedlist.problem;

import com.mozahidone.linkedlist.LinkedList;

public class ReverseLinkedList {

public static void main(String[] args) {
    LinkedList linkedList = new LinkedList();
    linkedList.pushNode(5);
    linkedList.pushNode(15);
    linkedList.pushNode(25);
    linkedList.pushNode(35);

    linkedList.traverse();
    linkedList.reverse();
    linkedList.traverse();
}
}
