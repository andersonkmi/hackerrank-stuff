package org.coolstuff.chapter4;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class PrintTreeNodesByLevel {
    public void print(TreeNode root) {
        Deque<TreeNode> nodes = new ArrayDeque<>();
        List<TreeNode> sequentialNodes = new LinkedList<>();
        nodes.add(root);

        while(!nodes.isEmpty()) {
            TreeNode node = nodes.removeFirst();
            sequentialNodes.add(node);

            if(node.getLeftChild() != null) {
                nodes.add(node.getLeftChild());
            }

            if(node.getRightChild() != null) {
                nodes.add(node.getRightChild());
            }
        }

        sequentialNodes.stream().forEach(t -> System.out.print(t.getValue() + " "));
    }
}
