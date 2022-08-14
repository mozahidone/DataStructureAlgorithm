package com.mozahidone.tree.problem;

public class ValidateBST {
    
    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(1);
        root.right = new Node(3);
        System.out.println(isValidBST(root, Double.MIN_VALUE, Double.MAX_VALUE));
    }
    private static boolean isValidBST(Node root, double minValue, double maxValue) {
        if (root == null)
            return true;
        if(root.data <= minValue || root.data >= maxValue)
            return false;
        boolean isLeftBST = isValidBST(root.left, minValue, root.data);
        boolean isRightBST = isValidBST(root.right, root.data, maxValue);
        if(!isLeftBST || !isRightBST)
            return false;
        return true;
    }
}
