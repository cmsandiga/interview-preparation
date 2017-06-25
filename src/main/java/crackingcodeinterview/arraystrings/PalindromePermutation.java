package crackingcodeinterview.arraystrings;

/**
 * Created by makoto on 18/06/17.
 */
public class PalindromePermutation {
    public static boolean isPalindromePermutation(String input) {
        input = input.toLowerCase();


        int hist[] = new int[26];

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (!Character.isLetter(c)) continue;

            hist[c  - 'a']++;
        }

        int countMiss = 0;

        for (int i = 0; i < hist.length && countMiss <= 1; i++) {

            if (hist[i] % 2 != 0) {
                countMiss++;
            }
        }

        return countMiss <= 1;
    }
}
