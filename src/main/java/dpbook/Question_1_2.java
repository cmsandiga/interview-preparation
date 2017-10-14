package dpbook;

public class Question_1_2 {

    int[] sum(int[] a) {

        sumUtil(a, a.length - 1);
        return a;
    }

    int sumUtil(int[] a, int i) {

        if (i < 0) {
            return 0;
        }

        int sum = sumUtil(a, i - 1) + a[i];
        a[i] = sum;
        return sum;
    }
}
