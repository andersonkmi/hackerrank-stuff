package org.coolstuff.chapter4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DepthList {
    public List<List<TreeNode>> createDepthList(TreeNode root) {
        List<List<TreeNode>> result = new ArrayList<>();
        createDepthList(root, result, 0);
        return result;
    }

    private void createDepthList(TreeNode node, List<List<TreeNode>> lists, int level) {
        if(node != null) {
            List<TreeNode> list;
            if(lists.size() == level) {
                list = new LinkedList<>();
                lists.add(list);
            } else {
                list = lists.get(level);
            }
            list.add(node);

            createDepthList(node.getLeftChild(), lists, level + 1);
            createDepthList(node.getRightChild(), lists, level + 1);
        }
    }
}
