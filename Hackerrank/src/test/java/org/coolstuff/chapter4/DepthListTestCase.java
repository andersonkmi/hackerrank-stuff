package org.coolstuff.chapter4;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class DepthListTestCase {
    private DepthList sut;
    private MinimalTree minimalTree;

    @Before
    public void setSut() {
        sut = new DepthList();
        minimalTree = new MinimalTree();
    }

    @Test
    public void test001() {
        int[] elements = {1, 2, 3, 4, 5, 6, 7, 8};
        TreeNode root = minimalTree.createMinimalBST(elements);
        List<List<TreeNode>> results = sut.createDepthList(root);
    }
}
