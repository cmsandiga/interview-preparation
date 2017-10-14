package dpbook;

/**
 * @author <a href="mailto:csandiga@uolinc.com">Makoto Sandiga</a>
 * @since 2017-09-15
 */
public class BubleSortRecursive {

    public void sort(int[] a, int length) {

        if (length <= 0)
            return;

        for (int i = 0; i < length - 1; i++) {
            if (a[i] > a[i + 1]) {
                swap(a, i, i + 1);
            }
        }

        sort(a, length - 1);
    }

    private void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
