package org.coolstuff.chapter8;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

/**
 * Created by andersonkmi on 7/2/2017.
 */
public class TripleStepTestCase {
    private TripleStep service;

    @Before
    public void setUp() {
        service = new TripleStep();
    }

    @Test
    public void test001() {
        Assert.assertThat(service.count(0), is(1));
    }

    @Test
    public void test002() {
        Assert.assertThat(service.count(1), is(1));
    }

    @Test
    public void test003() {
        Assert.assertThat(service.count(2), is(2));
    }

    @Test
    public void test004() {
        Assert.assertThat(service.count(3), is(4));
    }

    @Test
    public void test005() {
        Assert.assertThat(service.count(4), is(7));
    }
}
