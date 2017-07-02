package org.coolstuff.chapter4;

public class MinimalTree {
    public TreeNode createMinimalBST(int[] numbers) {
        return createMinimalBST(numbers, 0, numbers.length - 1);
    }

    private TreeNode createMinimalBST(int[] array, int start, int end) {
        if(end < start) {
            return null;
        }

        int middle = (end + start) / 2;
        TreeNode node = new TreeNode();
        node.setValue(array[middle]);
        node.setLeftChild(createMinimalBST(array, start, middle - 1));
        node.setRightChild(createMinimalBST(array, middle + 1, end));
        return node;
    }
}
