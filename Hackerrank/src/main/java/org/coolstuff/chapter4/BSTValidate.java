package org.coolstuff.chapter4;

public class BSTValidate {
    public boolean isValid(TreeNode root) {
        return validate(root);
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
}
