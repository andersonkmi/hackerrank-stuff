package org.coolstuff;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by anderson.ito on 25/07/2016.
 */
public class VisitedPagesTestCase {

    private VisitedPages service;

    @Before
    public void setUp() {
        service = new VisitedPages();
    }

    @Test
    public void test001() {
        List<String> items = new ArrayList<>();
        items.add("user1,/home");
        items.add("user1,/home/login");
        items.add("user1,/home/login/test");
        items.add("user1,/home/login/edit");
        items.add("user2,/about");
        items.add("user2,/about/contact");
        items.add("user2,/home");

        Map<String, Set<String>> results = service.findMostVisitedPages(items);
    }
}
