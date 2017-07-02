package org.coolstuff.chapter4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class BSTValidateTestCase {
    private BSTValidate sut;

    @Before
    public void setUp() {
        sut = new BSTValidate();
    }

    @Test
    public void test001() {
        int[] elements = {1, 2, 3, 4, 5, 6, 7, 8};
        MinimalTree service = new MinimalTree();
        TreeNode root = service.createMinimalBST(elements);

        Assert.assertThat(sut.isValid(root), is(true));
    }

    @Test
    public void test002() {
        int[] elements = {1, 2, 3, 4, 5, 6, 7, 8};
        MinimalTree service = new MinimalTree();
        TreeNode root = service.createMinimalBST(elements);
        root.setValue(9);
        Assert.assertThat(sut.isValid(root), is(false));
    }

    @Test
    public void test003() {
        int[] elements = {1, 2, 3, 4, 5, 6, 7, 8};
        MinimalTree service = new MinimalTree();
        TreeNode root = service.createMinimalBST(elements);
        root.getLeftChild().setValue(-1);
        Assert.assertThat(sut.isValid(root), is(true));
    }

    @Test
    public void test004() {
        int[] elements = {1, 2, 3, 4, 5, 6, 7, 8};
        MinimalTree service = new MinimalTree();
        TreeNode root = service.createMinimalBST(elements);
        root.getLeftChild().setValue(50);
        Assert.assertThat(sut.isValid(root), is(false));
    }

}
