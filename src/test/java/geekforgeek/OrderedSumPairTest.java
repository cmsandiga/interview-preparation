package geekforgeek;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by makoto on 25/06/17.
 */
public class OrderedSumPairTest {

    @Test
    public void bruteforce() {

        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 3, 5, 8};
        int x = 10;

        int count = OrderedSumPair.bruteforce(arr1, arr2, x);

        Assert.assertEquals(2, count);


    }


    @Test
    public void optimalSolution() {

        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 3, 5, 8};
        int x = 10;

        int count = OrderedSumPair.optimalSolution(arr1, arr2, x);

        Assert.assertEquals(2, count);
    }

    @Test
    public void optimalSolutionSecond() {

        int[] arr1 = {1, 2, 3, 4, 5, 7, 11};
        int[] arr2 = {2, 3, 4, 5, 6, 8, 12};
        int x = 9;

        int count = OrderedSumPair.optimalSolution(arr1, arr2, x);

        Assert.assertEquals(5, count);
    }

    @Test
    public void optimalSolutionSecondGeekForGeek() {

        int[] arr1 = {1, 2, 3, 4, 5, 7, 11};
        int[] arr2 = {2, 3, 4, 5, 6, 8, 12};
        int x = 9;

        int count = OrderedSumPair.optimalSolutionSecondGeekForGeek(arr1, arr2, x);

        Assert.assertEquals(5, count);
    }

}
