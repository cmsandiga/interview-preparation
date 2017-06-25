package crackingcodeinterview.arraystrings;

/**
 * Created by makoto on 16/06/17.
 */
public class StringCompression {

    public static String compress(String input) {

        if (input.length() == 1) {
            return input;
        }

        char last = input.charAt(0);
        int c = 1;

        StringBuilder result = new StringBuilder();

        for (int i = 1; i < input.length(); i++) {

            if (last == input.charAt(i)) {
                c++;
            } else {
                result.append(last).append(c);
                c = 1;
                last = input.charAt(i);
            }

            if ((input.length() - 1) == i) {
                result.append(last).append(c);
            }

        }
        return result.length() >= input.length() ? input : result.toString();
    }
}
