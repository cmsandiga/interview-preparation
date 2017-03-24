package pramp.interviewee;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by makoto on 28/02/17.
 * <p>
 * Island Count
 * <p>
 * Given a 2D matrix M, filled with either 0s or 1s, count the number of islands of 1s in M.
 * An island is a group of adjacent values that are all 1s. Every cell in M can be adjacent to the 4 cells that are next to it on the same row or column.
 * <p>
 * Explain and code the most efficient solution possible and analyze its runtime complexity.
 * <p>
 * Example: the matrix below has 6 islands:
 * <p>
 * 0  1  0  1  0
 * 0  0  1  1  1
 * 1  0  0  1  0
 * 0  1  1  0  0
 * 1  0  1  0  1
 */
public class CountILand {

    public int findCountIland(int[][] map) {

        int countIland = 0;

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == 1) {
                    markVisited(map, i, j);
                    countIland++;
                }
            }
        }
        return countIland;
    }

    private void markVisited(int[][] map, int i, int j) {

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(i, j));

        while (!q.isEmpty()) {

            Pair pair = q.poll();

            if (map[pair.i][pair.j] == 1) {
                pushIfValid(map, pair.i, pair.j + 1, q);
                pushIfValid(map, pair.i, pair.j + -1, q);
                pushIfValid(map, pair.i + 1, pair.j, q);
                pushIfValid(map, pair.i - 1, pair.j, q);
                map[pair.i][pair.j] = 2;
            }
        }
    }

    private void pushIfValid(int[][] map, int i, int j, Queue<Pair> q) {
        if (i >= 0 && i < map.length && j >= 0 && j < map[i].length) {
            q.add(new Pair(i, j));
        }
    }

    class Pair {
        int i;
        int j;

        public Pair(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }
}
