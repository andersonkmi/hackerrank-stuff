package org.coolstuff;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by andersonkmi on 7/23/2016.
 */
public class VerifyParenthesisBalanceTestCase {
    private VerifyParenthesisBalance balance;

    @Before
    public void setUp() {
        balance = new VerifyParenthesisBalance();
    }

    @Test
    public void testBalance001() {
        String input = "";
        Assert.assertTrue(balance.isBalanced(input));
    }

    @Test
    public void testBalance002() {
        Assert.assertTrue(balance.isBalanced("121(222)"));
    }

    @Test
    public void testBalance003() {
        Assert.assertTrue(balance.isBalanced("()"));
    }

    @Test
    public void testBalance004() {
        Assert.assertTrue(balance.isBalanced("121 (  000)"));
    }

    @Test
    public void testBalance005() {
        Assert.assertTrue(balance.isBalanced("{12 + [222 + 2]}"));
    }

    @Test
    public void testBalance006() {
        Assert.assertFalse(balance.isBalanced("("));
    }

    @Test
    public void testBalance007() {
        Assert.assertFalse(balance.isBalanced("(12)["));
    }

    @Test
    public void testBalance008() {
        Assert.assertFalse(balance.isBalanced("(12))"));
    }

    @Test
    public void testBalance009() {
        Assert.assertFalse(balance.isBalanced("(123 + 23 + [9 + 8 * (222))"));
    }
}
