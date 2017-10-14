package dpbook;

import org.junit.Assert;
import org.junit.Test;

public class Question_4_1Test {

    @Test
    public void totalWays() throws Exception {

        int[][] matrix = new int[1000][1000];

        int result = new Question_4_1().totalWays(matrix);

        Assert.assertEquals(6, result);

    }

}