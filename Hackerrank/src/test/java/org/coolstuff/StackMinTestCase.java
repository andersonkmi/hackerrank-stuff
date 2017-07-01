package org.coolstuff;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;

/**
 * Created by andersonkmi on 7/1/2017.
 */
public class StackMinTestCase {
    StackMin service;

    @Before
    public void setup() {
        service = new StackMin();
    }

    @Test
    public void test001() {
        Assert.assertThat(service.getMinimumValue(), is(Integer.MAX_VALUE));
    }

    @Test
    public void test002() {
        service.push(2);
        Assert.assertThat(service.getMinimumValue(), is(2));
    }

    @Test
    public void test003() {
        service.push(2);
        service.push(1);
        Assert.assertThat(service.getMinimumValue(), is(1));
    }

    @Test
    public void test004() {
        service.push(5);
        service.push(6);
        service.push(3);
        service.push(7);
        service.pop();
        service.pop();
        Assert.assertThat(service.getMinimumValue(), is(5));
    }
}
