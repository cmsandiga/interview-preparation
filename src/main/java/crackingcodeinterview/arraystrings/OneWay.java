package crackingcodeinterview.arraystrings;

/**
 * Created by makoto on 18/06/17.
 */
public class OneWay {
    public static boolean oneWay(String a, String b) {

        int hist[] = new int[26];

        for (int i = 0; i < a.length(); i++) {
            hist[a.charAt(i) - 'a']++;
        }

        for (int i = 0; i < b.length(); i++) {
            hist[b.charAt(i) - 'a']--;
        }

        int miss = 0;

        for (int i = 0; i < hist.length && miss <= 1; i++) {
            miss += Math.abs(hist[i]);
        }

        return miss <= 1;
    }
}
