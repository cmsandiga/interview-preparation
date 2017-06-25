package crackingcodeinterview.arraystrings;

import java.util.Arrays;

/**
 * Created by makoto on 18/06/17.
 */
public class RotateMatrix {

    public static int[][] rotate(int[][] matrix) {
        int temp[][] = new int[matrix.length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                temp[i][j] = matrix[3 - 1 - j][i];
            }
        }
        return temp;
    }

    public static void print(int[][] matrix) {
        System.out.println("----------------");
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println("----------------");
    }
}
