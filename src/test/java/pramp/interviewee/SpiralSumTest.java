package pramp.interviewee;

import org.junit.Test;

public class SpiralSumTest {

    @Test
    public void test() {
        int[][] matrix = {
                {1}, {2}
        };
        int[] test = SpiralSum.spiralSum(matrix);
        System.out.println(test);
    }

}