package org.coolstuff.chapter4;

import org.junit.Before;
import org.junit.Test;

public class MinimalTreeTestCase {
    private MinimalTree sut;

    @Before
    public void setUp() {
        sut = new MinimalTree();
    }

    @Test
    public void test001() {
        int[] elements = {1, 2, 3, 4, 5, 6, 7, 8};
        TreeNode root = sut.createMinimalBST(elements);
    }
}
