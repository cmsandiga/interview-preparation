package pramp.interviewee;

/**
 * Created by makoto on 17/03/17.
 * <p>
 * Sentence Reverse
 * <p>
 * You are given an array of characters arr, which consists of sequences of characters separated by space characters. Each space-delimited sequence of characters defines a word.
 * How can you most efficiently reverse the order of the words in the array?
 * Explain and implement your solution. Lastly, analyze its time and space complexities.
 * <p>
 * For example:
 * [ 'p', 'e', 'r', 'f', 'e', 'c', 't', '  ', 'm', 'a', 'k', 'e', 's', '  ', 'p', 'r', 'a', 'c', 't', 'i', 'c', 'e' ]
 * <p>
 * would turn into:
 * [ 'p', 'r', 'a', 'c', 't', 'i', 'c', 'e', '  ', 'm', 'a', 'k', 'e', 's', '  ', 'p', 'e', 'r', 'f', 'e', 'c', 't' ]
 */
public class ReverseString {

    public static void main(String[] args) {
        String pramp = "Practice Makes Perfect";
        System.out.println(reverse(pramp.toCharArray()));
    }

    public static char[] reverse(char[] arr) {
        int N = arr.length;

        for (int i = 0, j = N - 1; i < N / 2; i++) {
            swap(arr, i, j);
        }   // O(N)

        int start = 0;
        int end = 1;

        while (end <= N - 1) {         // O(n)
            if (arr[end] == ' ' || end == N) {
                for (int i = start, j = end; i < j; i++, j--) {
                    swap(arr, i, j);
                }
            }
            end++;
        }
        return arr;
    }

    // O(2N)-> O(N)
    public static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}
