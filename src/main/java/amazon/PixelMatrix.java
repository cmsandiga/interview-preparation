package amazon;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author <a href="mailto:csandiga@uolinc.com">Makoto Sandiga</a>
 * @since 2017-08-25
 */
public class PixelMatrix {


    public void transform(boolean[][] matrix, Coordinate coordinate) {

        Queue<Coordinate> queue = new LinkedList<>();
        queue.offer(coordinate);

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            addIfValid(matrix, queue, c.x, c.y + 1); //up
            addIfValid(matrix, queue, c.x + 1, c.y); // right
            addIfValid(matrix, queue, c.x, c.y - 1); // down
            addIfValid(matrix, queue, c.x - 1, c.y); // left

            matrix[c.x][c.y] = false;
        }
    }

    private void addIfValid(boolean[][] matrix, Queue<Coordinate> q, int x, int y) {

        if (matrix.length > x &&
                x >= 0 &&
                matrix[0].length > y &&
                y >= 0 &&
                matrix[x][y]) {
            q.offer(new Coordinate(x, y));
        }
    }

    public static class Coordinate {
        int x;
        int y;

        public Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
