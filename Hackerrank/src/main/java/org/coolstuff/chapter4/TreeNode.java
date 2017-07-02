package org.coolstuff.chapter4;

/**
 * Created by andersonkmi on 7/2/2017.
 */
public class TreeNode {
    private Integer value;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public void setValue(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public void setLeftChild(TreeNode node) {
        leftChild = node;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setRightChild(TreeNode node) {
        rightChild = node;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }
}
