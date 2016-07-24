package org.coolstuff;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andersonkmi on 7/23/2016.
 */
public class SpecialSortingTestCase {
    private SpecialSorting sorting;

    @Before
    public void setUp() {
        sorting = new SpecialSorting();
    }

    @Test
    public void test001() {
        List<String> elements = new ArrayList<>();
        elements.add("Jervie,12,M");
        elements.add("Jaimy,11,F");
        elements.add("Tony,23,M");
        elements.add("Janey,11,F");

        List<String> results = sorting.sortItems(elements);
    }
}
