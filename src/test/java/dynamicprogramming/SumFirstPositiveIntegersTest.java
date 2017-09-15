package dynamicprogramming;

import dynamicprogramming.ch1.SumFirstPositiveIntegers;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author <a href="mailto:csandiga@uolinc.com">Makoto Sandiga</a>
 * @since 2017-09-14
 */
public class SumFirstPositiveIntegersTest {

    @Test
    public void sum() throws Exception {
        // 1 + 2 + 3 + 4
        int sum = new SumFirstPositiveIntegers().sum(4);
        Assert.assertEquals(10, sum);
    }

    @Test
    public void sumZero() throws Exception {
        // 1 + 2 + 3 + 4
        int sum = new SumFirstPositiveIntegers().sum(0);
        Assert.assertEquals(0, sum);
    }

}