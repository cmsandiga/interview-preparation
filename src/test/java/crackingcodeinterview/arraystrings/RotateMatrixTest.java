package crackingcodeinterview.arraystrings;

import org.junit.Test;

/**
 * Created by makoto on 18/06/17.
 */
public class RotateMatrixTest {

    @Test
    public void test() {

        int[][] matrix = new int[][]{ //
                {1, 2, 3}, //
                {4, 5, 6}, //
                {7, 8, 9} //
        };

        RotateMatrix.print(matrix);
        RotateMatrix.print(RotateMatrix.rotate(matrix));

    }


}
