package crackingcodeinterview.arraystrings;

/**
 * Created by makoto on 16/06/17.
 */
public class URLfy {

    private static final char replace[] = {'%', '2', '0'};

    public static String urlfy(String input, int n) {

        int head = input.length() - 1;

        int tailIt = n - 1;
        int tail = n - 1;

        char a[] = input.toCharArray();

        while (tailIt >= 0) {

            if (a[tailIt] == ' ') {

                for (int i = tail; i > tailIt; i--) {
                    swap(a, head, i);
                    head--;
                }


                replace(head, a);

                tail = tailIt - 1;
                head -= 3;
            }
            tailIt--;

        }

        return new String(a);
    }

    private static void replace(int head, char[] a) {
        int it = 0;

        for (int i = head - 2; i <= head; i++) {
            a[i] = replace[it];
            it++;
        }
    }


    static void swap(char[] a, int i, int j) {
        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
