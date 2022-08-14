package com.mozahidone.tree.problem;

public class TreeTraversal {

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left= new Node(7);
        root.right = new Node(15);
        root.left.left = new Node(5);
        root.left.right = new Node(8);
        root.right.left = new Node(12);
        root.right.right = new Node(19);

        postOrder(root);
    }
    public static void preOrder(Node root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(Node root) {
        if (root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void postOrder(Node root) {
        if(root == null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }
}
