package com.mozahidone.tree.problem;

public class BinaryTreeHeight {
    public static int height(Node root) {
        if(root == null)
            return -1;
        return Math.max(height(root.left), height(root.right))+1;
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(7);
        root.right = new Node(15);

        root.left.left = new Node(3);
        root.left.right = new Node(8);

        root.right.left = new Node(13);
        root.right.right = new Node(18);

        System.out.println(height(root));
    }

}
