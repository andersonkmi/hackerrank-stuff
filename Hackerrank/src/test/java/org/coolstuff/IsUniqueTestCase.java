package org.coolstuff;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by andersonkmi on 8/17/2016.
 */
public class IsUniqueTestCase {
    private IsUnique service;

    @Before
    public void setUp() {
        service = new IsUnique();
    }

    @Test
    public void testNullArgument() {
        Assert.assertTrue(service.verify(null));
    }

    @Test
    public void testEmptyInput() {
        Assert.assertTrue(service.verify(""));
    }

    @Test
    public void testSingleCharInput() {
        Assert.assertTrue(service.verify("a"));
    }

    @Test
    public void testTwoCharInput() {
        Assert.assertTrue(service.verify("an"));
    }

    @Test
    public void testBiggerStrings() {
        Assert.assertTrue(service.verify("europa"));
    }

    @Test
    public void testRepeatedChars() {
        Assert.assertFalse(service.verify("array"));
    }
}
