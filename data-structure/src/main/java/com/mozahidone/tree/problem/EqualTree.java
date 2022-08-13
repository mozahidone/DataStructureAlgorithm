package com.mozahidone.tree.problem;

// Determine if Two Trees are Identical
public class EqualTree {

    public static void main(String[] args) {
        Node root1 = new Node(10);
        root1.left = new Node(7);
        root1.right = new Node(15);

        Node root2 = new Node(10);
        root2.left = new Node(7);
        root2.right = new Node(15);

        System.out.println(isEqual(root1, root2));
    }

    public static boolean isEqual(Node first, Node second) {
        //todo need to implement
        return true;
    }
}
