package pramp.interviewer;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by makoto on 19/02/17.
 */
public class MinimumSubstring {

    public static void main(String[] args) {

        System.out.println(getShortestUniqueSubstring(new char[]{'x', 'y', 'z'}, "xyyzyzyx"));
        System.out.println(minLenSubStringWithAllChars("xyyzyzyx", "xyz"));

    }

    public static String getShortestUniqueSubstring(char[] arr, String str) {
        int t = 0;
        String result = null;
        int uniqueCounter = 0;

        Map<Character, Integer> countMap = new HashMap<>();
        //initialize countMap:
        for (int i = 0; i < arr.length; i++) {
            countMap.put(arr[i], 0);
        }
        //scan str
        for (int h = 0; h < str.length(); h++) {
            //handle the new head
            char head = str.charAt(h);

            if (!countMap.containsKey(head))
                continue;

            int headCount = countMap.get(head);

            if (headCount == 0)
                uniqueCounter++;

            countMap.put(head, headCount + 1);

            while (uniqueCounter == arr.length) {
                int tempLength = h - t + 1;

                if (tempLength == arr.length)
                    return str.substring(t, h + 1);


                if (result == null || tempLength < result.length())
                    result = str.substring(t, h + 1);

                char tail = str.charAt(t);

                if (countMap.containsKey(tail)) {
                    int tailCount = countMap.get(tail) - 1;
                    if (tailCount == 0)
                        uniqueCounter--;
                    countMap.put(tail, tailCount);
                }

                t++;
            }
        }
        return result;
    }

    private static int countMatches(int[] textHist, int[] patHist) {
        int match = 0;
        for (int i = 0; i < 256; i++) {
            if (patHist[i] > 0 && textHist[i] > 0) {
                match++;
            }
        }
        return match;
    }

    public static String minLenSubStringWithAllChars(String str, String t) {
        int[] textHist = new int[256];
        int[] patternHistory = new int[256];
        int start = 0;
        int end = 0;
        int minLen = Integer.MAX_VALUE;
        int bestStart = 0;
        int bestEnd = 0;

        //prepare the initial window of size of the char set
        for (end = 0; end < t.length(); end++) {
            textHist[str.charAt(end)]++;
            patternHistory[t.charAt(end)]++;
        }

        while (start < str.length()) {
            int matches = countMatches(textHist, patternHistory);
            //if current window doesn't contain all the characters
            //then strech the window to right upto the end of string
            if (matches < t.length() && end < str.length()) {
                //strech window
                textHist[str.charAt(end)]++;
                end++;
            }
            //if current window contains all the characters with frequency
            //at least one then we have the freedom to shrink the window
            //from front.
            else if (matches >= t.length()) {
                //as current window contains all character so update minLen
                if (end - start < minLen) {
                    minLen = end - start;
                    bestStart = start;
                    bestEnd = end;
                }
                //shrink window
                textHist[str.charAt(start)]--;
                start++;
            }
            //if current window doesn't cntains all chars
            //but we can't strech the window anymore then break
            else {
                break;
            }
        }

        return str.substring(bestStart, bestEnd);
    }
}
