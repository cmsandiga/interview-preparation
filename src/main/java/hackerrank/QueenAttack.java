package hackerrank;

import java.util.Scanner;

/**
 * Created by makoto on 27/01/17.
 * https://www.hackerrank.com/challenges/queens-attack-2
 */
public class QueenAttack {

    private static int FILL = 2;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a2[][] = new int[n][n];

        int rQueen = in.nextInt() - 1;
        int cQueen = in.nextInt() - 1;
        a2[rQueen][cQueen] = 1;

        for (int a0 = 0; a0 < k; a0++) {
            int rObstacle = in.nextInt() - 1;
            int cObstacle = in.nextInt() - 1;
            a2[rObstacle][cObstacle] = -1;
        }

        long upleft = upleft(rQueen, cQueen, a2);
        long up = up(rQueen, cQueen, a2);
        long upright = upright(rQueen, cQueen, a2);

        long right = right(rQueen, cQueen, a2);

        long downright = downright(rQueen, cQueen, a2);
        long down = down(rQueen, cQueen, a2);
        long downleft = downleft(rQueen, cQueen, a2);


        long left = left(rQueen, cQueen, a2);

        System.out.println(upleft + up + upright + right + downright + down + downleft + left);
    }

    public static long upleft(int r, int c, int[][] a) {
        long upleft = -1;

        while (r >= 0 && c >= 0 && a[r][c] != -1) {
            upleft++;
            r--;
            c--;
        }
        return upleft;
    }

    public static long up(int r, int c, int[][] a2) {
        long up = -1;
        while (r >= 0 && a2[r][c] != -1) {
            up++;
            r--;
        }
        return up;
    }

    public static long upright(int r, int c, int[][] a2) {
        long upright = -1;
        while (r >= 0 && c < a2.length && a2[r][c] != -1) {
            upright++;
            r--;
            c++;
        }
        return upright;
    }

    public static long right(int r, int c, int[][] a2) {
        long right = -1;
        while (c < a2.length && a2[r][c] != -1) {
            right++;
            c++;
        }
        return right;
    }

    public static long downright(int r, int c, int[][] a2) {
        long downright = -1;
        while (c < a2.length && r < a2.length && a2[r][c] != -1) {
            downright++;
            r++;
            c++;
        }
        return downright;
    }

    public static long down(int r, int c, int[][] a2) {
        long down = -1;
        while (r < a2.length && a2[r][c] != -1) {
            down++;
            r++;
        }
        return down;
    }

    public static long downleft(int r, int c, int[][] a2) {
        long downleft = -1;
        while (c >= 0 && r < a2.length && a2[r][c] != -1) {
            downleft++;
            r++;
            c--;
        }
        return downleft;
    }

    public static long left(int r, int c, int[][] a2) {
        long left = -1;
        while (c >= 0 && a2[r][c] != -1) {
            left++;
            c--;
        }
        return left;
    }
}
