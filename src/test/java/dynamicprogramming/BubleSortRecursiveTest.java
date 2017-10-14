package dynamicprogramming;

import dpbook.BubleSortRecursive;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author <a href="mailto:csandiga@uolinc.com">Makoto Sandiga</a>
 * @since 2017-09-15
 */
public class BubleSortRecursiveTest {

    @Test
    public void sort() throws Exception {
        int[] a = {9, 6, 2, 12, 11, 9, 3, 7};

        new BubleSortRecursive().sort(a, a.length);
        int[] result = {2, 3, 6, 7, 9, 9, 11, 12};
        Assert.assertArrayEquals(result, a);
    }

}