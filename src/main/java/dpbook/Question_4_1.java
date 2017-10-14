package dpbook;


/***
 * Given a matrix of order N*N what are total number of ways in which we cam move from top-left
 * to the bottom-right cell (arr[N-1][N-1]), given that we can only move either downward or rightwards
 */
public class Question_4_1 {

    int total = 0;

    public int totalWays(int m[][]) {


        return totalWaysUtil(m, 0, 0);
    }

    private int totalWaysUtil(int[][] m, int i, int j) {

        if (i < 0 || j < 0 || i >= m.length || j >= m[i].length) {
            return 0;
        }

        if (m.length - 1 == i && m[i].length - 1 == j) {
            return 1;
        }

        return totalWaysUtil(m, i + 1, j) + totalWaysUtil(m, i, j + 1);


    }
}
