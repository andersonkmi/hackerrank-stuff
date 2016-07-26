package org.coolstuff;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Created by andersonkmi on 7/25/2016.
 */
public class FindInArraysTestCase {

    private FindInArrays service;

    @Before
    public void setUp() {
        service = new FindInArrays();
    }

    @Test
    public void test001() {
        int[][] arrays = new int[2][3];
        arrays[0][0] = 3;
        arrays[0][1] = 5;
        arrays[0][2] = 4;

        arrays[1][0] = 3;
        arrays[1][1] = 3;
        arrays[1][2] = 4;

        List<Integer> result = service.find(arrays);
    }
}
