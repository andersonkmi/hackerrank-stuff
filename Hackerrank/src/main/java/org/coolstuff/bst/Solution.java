package org.coolstuff.bst;

public class Solution {
    public static void main(String[] args) {

    }

    private static boolean checkBST(Node node) {
        return checkBST(node, null, null);
    }

    private static boolean checkBST(Node node, Integer min, Integer max) {
        if(node == null) {
            return true;
        }

        if((min != null && node.data <= min) || (max != null && node.data >= max)) {
            return false;
        }

        if(!checkBST(node.left, min, node.data) || !checkBST(node.right, node.data, max)) {
            return false;
        }
        return true;
    }
}
