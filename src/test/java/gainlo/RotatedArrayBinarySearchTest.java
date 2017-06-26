package gainlo;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by makoto on 25/06/17.
 */
public class RotatedArrayBinarySearchTest {


    @Test
    public void elementNotFoundWhenInputIsEmpty() {

        int[] a = {};
        int element = RotatedArrayBinarySearch.findElement(a, 20);

        Assert.assertEquals(-1, element);
    }

    @Test
    public void elementNotFoundWhenInputIsNull() {

        int[] a = null;
        int element = RotatedArrayBinarySearch.findElement(a, 20);

        Assert.assertEquals(-1, element);
    }

    @Test
    public void elementNotFoundWhenInputIsNull1() {

        int[] a = {50,20};
        int element = RotatedArrayBinarySearch.findElement(a, 20);

        Assert.assertEquals(20, element);
    }

    @Test
    public void foundWhenInputOnlyHaveOneElement() {

        int[] a = {1};
        int element = RotatedArrayBinarySearch.findElement(a, 1);

        Assert.assertEquals(1, element);
    }

    @Test
    public void foundWhenInputIsValid() {

        int[] a = {10, 20, 1, 3, 6, 7, 8};

        int element = RotatedArrayBinarySearch.findElement(a, 20);

        Assert.assertEquals(20, element);
    }

    @Test
    public void foundWhenInputIsValid2() {

        int[] a = {10, 20, 1, 3, 6, 7, 8};

        int element = RotatedArrayBinarySearch.findElement(a, 7);

        Assert.assertEquals(7, element);
    }


    @Test
    public void foundWhenInputIsValid3() {

        int[] a = {10, 20, 1, 3, 6, 7, 8};

        int element = RotatedArrayBinarySearch.findElement(a, 1);

        Assert.assertEquals(1, element);
    }

    @Test
    public void foundWhenInputIsValid4() {

        int[] a = {10, 20, 1, 3, 6, 7, 8};

        int element = RotatedArrayBinarySearch.findElement(a, 8);

        Assert.assertEquals(8, element);
    }

    @Test
    public void foundWhenInputIsValid5() {

        int[] a = {10, 20, 1, 3, 6, 7, 8};

        int element = RotatedArrayBinarySearch.findElement(a, 10);

        Assert.assertEquals(10, element);
    }
}
