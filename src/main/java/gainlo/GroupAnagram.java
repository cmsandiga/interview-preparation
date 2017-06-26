package gainlo;

import java.util.*;

/**
 * Created by makoto on 25/06/17.
 */
public class GroupAnagram {

    public static List<Set<String>> groupAnagrams(String[] words) {
        Map<String, Set<String>> anagramGroup = new HashMap<>();

        for (int i = 0; i < words.length; i++) {

            String key = sortString(words[i]);

            if (anagramGroup.containsKey(key)) {
                anagramGroup.get(key).add(words[i]);
            } else {
                Set<String> anagrams = new HashSet<>();
                anagrams.add(words[i]);
                anagramGroup.put(key, anagrams);
            }
        }

        List<Set<String>> result = new ArrayList<>();

        for (Set<String> group : anagramGroup.values()) {
            result.add(group);
        }

        return result;
    }

    public static String sortString(String word) {
        char[] wordChars = word.toCharArray();
        Arrays.sort(wordChars);
        return new String(wordChars);
    }
}
