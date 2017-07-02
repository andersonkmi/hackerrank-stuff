package org.coolstuff.chapter8;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class RecursiveMultiplyTestCase {
    private RecursiveMultiply service;

    @Before
    public void setup() {
        service = new RecursiveMultiply();
    }

    @Test
    public void test001() {
        Assert.assertThat(service.multiply(2, 1), is(2));
    }

    @Test
    public void test002() {
        Assert.assertThat(service.multiply(2, 2), is(4));
    }

    @Test
    public void test003() {
        Assert.assertThat(service.multiply(1, 1), is(1));
    }

    @Test
    public void test004() {
        Assert.assertThat(service.multiply(5, 2), is(10));
    }
}
