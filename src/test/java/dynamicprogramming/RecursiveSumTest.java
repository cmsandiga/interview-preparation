package dynamicprogramming;

import dpbook.RecursiveSum;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author <a href="mailto:csandiga@uolinc.com">Makoto Sandiga</a>
 * @since 2017-09-14
 */
public class RecursiveSumTest {

    @Test
    public void sum() throws Exception {

        int[] arr = {1, 2, 3, 4, 5, 6};

        new RecursiveSum().sum(arr);

        Assert.assertEquals(1, arr[0]);
        Assert.assertEquals(3, arr[1]);
        Assert.assertEquals(6, arr[2]);
        Assert.assertEquals(10, arr[3]);
        Assert.assertEquals(15, arr[4]);
        Assert.assertEquals(21, arr[5]);

    }
}