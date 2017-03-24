package pramp.interviewee;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by makoto on 20/02/17.
 */
public class QuadSumTest {

    @Test
    public void quadSumTest() {
        int a[] = new int[]{5, 2, 3, 1, 4};
        int s = 14;

        int[] quadsum = new QuadSum().quadsum(a, s);
        Arrays.sort(quadsum);
        Assert.assertArrayEquals(new int[]{0, 1, 2, 4}, quadsum);
    }


    @Test
    public void quadSumTest2() {
        int a[] = new int[]{5, 5, 4, 4, 1};
        int s = 18;

        int[] quadsum = new QuadSum().quadsum(a, s);
        Arrays.sort(quadsum);
        Assert.assertArrayEquals(new int[]{0, 1, 2, 3}, quadsum);
    }
}
