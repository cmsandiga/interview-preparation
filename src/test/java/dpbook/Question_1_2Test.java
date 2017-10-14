package dpbook;

import org.junit.Assert;
import org.junit.Test;

public class Question_1_2Test {

    @Test
    public void test() {
        int[] a = {1, 2, 3, 4, 5, 6};
        int[] sum = new Question_1_2().sum(a);
        Assert.assertEquals(1, sum[0]);
        Assert.assertEquals(3, sum[1]);
        Assert.assertEquals(6, sum[2]);
        Assert.assertEquals(10, sum[3]);
        Assert.assertEquals(15, sum[4]);
        Assert.assertEquals(21, sum[5]);
    }
}