package pramp.interviewee;


import org.junit.Assert;
import org.junit.Test;

/**
 * Created by makoto on 28/02/17.
 */
public class CountIlandTest {

    @Test
    public void test() {
        int[][] d2 = {{0, 0, 0}, {0, 1, 0}};
        int count = new CountILand().findCountIland(d2);

        Assert.assertEquals(1, count);
    }

    @Test
    public void test2() {
        int[][] d2 = {{1, 1, 1}, {0, 1, 0}};
        int count = new CountILand().findCountIland(d2);

        Assert.assertEquals(1, count);
    }

    @Test
    public void test3() {
        int[][] d2 = {
                {0, 1, 0, 1, 0}, //
                {0, 0, 1, 1, 1},//
                {1, 0, 0, 1, 0},//
                {0, 1, 1, 0, 0},//
                {1, 0, 1, 0, 1}
        };
        int count = new CountILand().findCountIland(d2);

        Assert.assertEquals(6, count);
    }
}

