package org.coolstuff.chapter4;

public class BSTValidate {
    public boolean isValid(TreeNode root) {
        return checkBST(root, null, null);
    }

    private boolean validate(TreeNode node) {
        int current = node.getValue();
        if(node.getLeftChild() != null) {
            if(node.getLeftChild().getValue() > current) {
                return false;
            } else {
                validate(node.getLeftChild());
            }
        }

        if(node.getRightChild() != null) {
            if(node.getRightChild().getValue() < current) {
                return false;
            } else {
                validate(node.getRightChild());
            }
        }

        return true;
    }

    private boolean checkBST(TreeNode node, Integer min, Integer max) {
        if(node == null) {
            return true;
        }

        if((min != null && node.getValue() <= min) || (max != null && node.getValue() > max)) {
            return false;
        }

        if(!checkBST(node.getLeftChild(), min, node.getValue()) || !checkBST(node.getRightChild(), node.getValue(), max)) {
            return false;
        }

        return true;
    }
}
