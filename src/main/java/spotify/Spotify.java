package spotify;

class Spotify {
    public static void main(String[] args) {
        // input: [4, 5, 6, 1, 2, 3] OK
        // output: 3

        // input: [4, 5, 6, 7, 8, 2, 3] OK
        // output: 5

        // input: [6, 1, 2, 3, 4, 5] OK
        // output: 1


        // input: [4, 5, 6, 7, 8, 2, 3]
        // output: 5

        // start = 0
        // end = 6
        // mid = 3 | a[mid] = 2
        int a[] = {4, 5, 6, 7, 8, 2, 3};
        System.out.println(findIndex(a));

        a = new int[]{4, 5, 6, 1, 2, 3};
        System.out.println(findIndex(a));

        a = new int[]{6, 1, 2, 3, 4, 5};
        System.out.println(findIndex(a));

        a = new int[]{1, 2, 3, 4, 5};
        System.out.println(findIndex(a));
        // input: [1, 2, 3, 4, 5]
        // output: 0

        // start = 0
        // end = 0
        // mid = 0
    }

    public static int findIndex(int a[]) {

        int start = 0;
        int end = a.length - 1;

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
        return -1;
    }
}
