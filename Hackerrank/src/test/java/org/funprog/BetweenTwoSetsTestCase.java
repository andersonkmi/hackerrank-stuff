package org.funprog;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BetweenTwoSetsTestCase {
    BetweenTwoSets sut;

    @Before
    public void setUp() {
        sut = new BetweenTwoSets();
    }

    @Test
    public void testCase001() {
        int[] first = {2, 4};
        int[] second = {16, 32, 96};

        assertThat(sut.getTotalX(first, second), is(3));
    }
}
