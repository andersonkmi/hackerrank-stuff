package org.funprog;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BreakingTheRecordsTestCase {
    private BreakingTheRecords sut;

    @Before
    public void setUp() {
        sut = new BreakingTheRecords();
    }

    @Test
    public void testCase001() {
        int[] scores = {10, 5, 20, 20, 4, 5, 2, 25, 1};
        assertThat(sut.breakingRecords(scores)[0], is(2));
        assertThat(sut.breakingRecords(scores)[1], is(4));
    }

    @Test
    public void testCase002() {
        int[] scores = {3, 4, 21, 36, 10, 28, 35, 5, 24, 42};
        assertThat(sut.breakingRecords(scores)[0], is(4));
        assertThat(sut.breakingRecords(scores)[1], is(0));
    }
}
