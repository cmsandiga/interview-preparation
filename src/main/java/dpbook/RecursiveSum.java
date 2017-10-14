package dpbook;

/**
 * @author <a href="mailto:csandiga@uolinc.com">Makoto Sandiga</a>
 * @since 2017-09-14
 * <p>
 * Question 1.2
 * Given an array, arr of integer write a recursive function that add
 * sum of all the previos numbers to each index of the array.
 * input => 1 2 3 4 5 6
 * output => 1 3 6 10 15 21
 */
public class RecursiveSum {

    public void sum(int[] a) {
        sumUtil(a, a.length - 1);
    }

    private void sumUtil(int[] a, int i) {


        if (i < 1) {
            return;
        }

        sumUtil(a, i -1);

        a[i] = a[i] + a[i - 1];

    }
}
