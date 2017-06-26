package gainlo;

/**
 * Created by makoto on 25/06/17.
 */
public class RotatedArrayBinarySearch {

    public static int findElement(int[] a, int element) {

        if (a == null || a.length == 0) {
            return -1;
        }

        if (a.length == 1) {
            return a[0] == element ? element : -1;
        }

        int pivot = findPivot(a);

        if (element >= a[pivot] && a[a.length - 1] >= element)
            return binarySearch(a, pivot, a.length - 1, element);
        else
            return binarySearch(a, 0, pivot - 1, element);
    }

    private static int binarySearch(int[] a, int start, int end, int element) {

        while (start <= end) {
            int mid = (start + end) / 2;

            if (a[mid] == element) {
                return a[mid];
            } else if (a[mid] > element) {
                end = mid - 1;
            } else {
                start = mid  + 1;
            }
        }

        return -1;
    }

    private static int findPivot(int[] a) {

        int start = 0;
        int end = a.length;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (a[mid] > a[mid + 1]) {
                return mid + 1;
            } else if (a[start] > a[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return 0;
    }
}
