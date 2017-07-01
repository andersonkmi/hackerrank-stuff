package org.coolstuff;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import static org.hamcrest.CoreMatchers.is;

/**
 * Created by andersonkmi on 7/1/17.
 */
public class OneAwayTestCase {
    OneAway check;

    @Before
    public void setup() {
        check = new OneAway();
    }

    @Test
    public void test001() {
        String str1 = "pale";
        String str2 = "ple";

        Assert.assertThat(check.verify(str1, str2), is(true));
    }

    @Test
    public void test002() {
        String str1 = "anderson";
        String str2 = "anderson";

        Assert.assertThat(check.verify(str1, str2), is(false));
    }

    @Test
    public void test003() {
        String str1 = "pales";
        String str2 = "pale";

        Assert.assertThat(check.verify(str1, str2), is(true));
    }

    @Test
    public void test004() {
        String str1 = "pale";
        String str2 = "bale";

        Assert.assertThat(check.verify(str1, str2), is(true));
    }

    @Test
    public void test005() {
        String str1 = "pale";
        String str2 = "bake";

        Assert.assertThat(check.verify(str1, str2), is(false));
    }
}
