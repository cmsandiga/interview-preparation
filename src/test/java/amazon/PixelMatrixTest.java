package amazon;

import org.junit.Test;

/**
 * @author <a href="mailto:csandiga@uolinc.com">Makoto Sandiga</a>
 * @since 2017-08-25
 */
public class PixelMatrixTest {

    @Test
    public void shouldPass() {
        boolean[][] matrix = {
                {false, false, true}, //
                {true, false, false},//
                {true, true, false},
        };
        int x = 2;
        int y = 0;
        PixelMatrix.Coordinate coordinate = new PixelMatrix.Coordinate(x, y);

        new PixelMatrix().transform(matrix, coordinate);
    }
}