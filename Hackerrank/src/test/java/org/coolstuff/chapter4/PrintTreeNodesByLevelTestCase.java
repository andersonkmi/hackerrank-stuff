package org.coolstuff.chapter4;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by andersonkmi on 7/2/2017.
 */
public class PrintTreeNodesByLevelTestCase {
    PrintTreeNodesByLevel sut;

    @Before
    public void setUp() {
        sut = new PrintTreeNodesByLevel();
    }

    @Test
    public void test001() {
        int[] elements = {1, 2, 3, 4, 5, 6, 7, 8};
        MinimalTree minimalTree = new MinimalTree();
        TreeNode root = minimalTree.createMinimalBST(elements);

        sut.print(root);
    }
}
