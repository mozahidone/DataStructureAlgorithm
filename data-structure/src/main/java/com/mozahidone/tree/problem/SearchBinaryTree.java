package com.mozahidone.tree.problem;

// Search a node in binary tree
public class SearchBinaryTree {

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(7);
        root.right = new Node(15);
        root.left.left = new Node(3);
        root.left.right = new Node(8);
        root.right.left = new Node(12);
        root.right.right = new Node(18);

        int key = 3;

        System.out.println(ifNodeExist(root, key));
    }

    private static boolean ifNodeExist(Node root, int key) {
        if (root == null)
            return false;
        if(root.data == key)
            return true;
        if(ifNodeExist(root.left, key))
            return true;
        return ifNodeExist(root.right, key);
    }
}
