package org.coolstuff;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import static org.hamcrest.CoreMatchers.is;


/**
 * Created by andersonkmi on 7/1/17.
 */
public class CheckPermutationTestCase {
    CheckPermutation check;

    @Before
    public void setup() {
        check = new CheckPermutation();
    }

    @Test
    public void verifyCheckWorks() {
        String first = "ovo";
        String second = "voo";

        Assert.assertThat(check.isPermutation(first, second), is(true));
    }

    @Test
    public void verifyCheckSameString() {
        String first = "anderson";
        String second = "anderson";

        Assert.assertThat(check.isPermutation(first, second), is(true));
    }

    @Test
    public void verifyCheckDiffStrings() {
        String first = "anderson";
        String second = "ito";

        Assert.assertThat(check.isPermutation(first, second), is(false));
    }
}
