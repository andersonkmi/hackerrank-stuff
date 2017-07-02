package org.coolstuff.chapter4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;

/**
 * Created by andersonkmi on 7/2/2017.
 */
public class RouteNodesTestCase {
    RouteNodes sut;
    GraphNode redBank = new GraphNode();
    GraphNode middletown = new GraphNode();
    GraphNode edison = new GraphNode();
    GraphNode mahwah = new GraphNode();
    GraphNode matawan = new GraphNode();
    GraphNode nyc = new GraphNode();
    GraphNode newark = new GraphNode();
    GraphNode aberdeen = new GraphNode();

    @Before
    public void setUp() {
        sut = new RouteNodes();

        redBank.setName("RedBank");

        middletown.setName("Middletown");

        mahwah.setName("Mahwah");

        edison.setName("Edison");

        matawan.setName("Matawan");

        nyc.setName("NYC");

        newark.setName("Newark");

        aberdeen.setName("Aberdeen");

        // add edges
        newark.add(aberdeen);
        newark.add(nyc);
        newark.add(matawan);
        nyc.add(mahwah);
        matawan.add(edison);
        aberdeen.add(matawan);
        aberdeen.add(middletown);
        mahwah.add(matawan);
        mahwah.add(redBank);
        edison.add(middletown);
        middletown.add(nyc);
    }

    @Test
    public void testFromNewarkToNYC() {
        Assert.assertThat(sut.hasRoute(newark, nyc), is(true));
    }

    @Test
    public void testFromMatawanToNYC() {
        Assert.assertThat(sut.hasRoute(matawan, nyc), is(true));
    }

    @Test
    public void testFromNewarkToMiddletown() {
        Assert.assertThat(sut.hasRoute(newark, middletown), is(true));
    }

    @Test
    public void testFromMiddletownToRedBank() {
        Assert.assertThat(sut.hasRoute(middletown, redBank), is(true));
    }

}
