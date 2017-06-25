package pramp.interviewee; /**
 * Created by makoto on 07/05/17.
 */
import java.util.*;

public class DeletionDistance {

    static int deletionDistance(String arr1, String arr2) {

        Map<Character, Integer> map1 = buildMap(arr1);
        Map<Character, Integer> map2 = buildMap(arr2);

        int difference = 0;

        // O(N) + O(M) + O(N)
        for(Map.Entry<Character, Integer> entry : map1.entrySet()){

            Integer v2 = map2.get(entry.getKey()) == null ? 0 : map2.get(entry.getKey());

            int diffTemp  = 0;

            diffTemp = Math.min(entry.getValue(), v2);

            difference += diffTemp;
        }

        return (arr1.length() +  arr2.length()) - (difference * 2);
    }

    public static Map<Character, Integer> buildMap(String word){
        Map<Character, Integer> map = new HashMap<>();

        for(char c : word.toCharArray()){

            Integer counter = map.get(c);

            if(counter == null)
                counter = 0;
            map.put(c, ++counter);
        }
        return map;
    }

    static int deletionDistance2(String str1, String str2) {
        int str1Len = str1.length();
        int str2Len = str2.length();
        int memo[][] = new int[str1Len][str2Len];

        for (int i = 0; i < str1Len; i++) {
            for (int j = 0; j < str2Len; j++) {
                if (i == 0)
                    memo[i][j] = j;
                else if (j == 0)
                    memo[i][j] = i;
                else if (str1.charAt(i - 1) == str2.charAt(j - 1))
                    memo[i][j] = memo[i - 1][j - 1];
                else
                    memo[i][j] = 1 + Math.min(memo[i - 1][j], memo[i][j - 1]);
            }
        }

        return memo[str1Len - 1][str2Len - 1];
    }

    static int deletionDistance3(String arr1, String arr2) {
        if (arr1 == null || arr1.length() == 0 || arr2 == null || arr2.length() == 0) {
            return 0;
        }

        HashMap<Character, Integer> hm1 = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();
        int n = arr1.length();
        int m = arr2.length();
        // count freq
        for (int i = 0; i < n; i++) {
            char cur = arr1.charAt(i);
            if (hm1.containsKey(cur)) {
                hm1.put(cur, hm1.get(cur));
            } else {
                hm1.put(cur, 1);
            }
        }

        for (int j = 0; j < m; j++) {
            char cur = arr2.charAt(j);
            if (hm2.containsKey(cur)) {
                hm2.put(cur, hm2.get(cur));
            } else {
                hm2.put(cur, 1);
            }
        }

        int s1 = hm1.size();
        int s2 = hm2.size();

        if (s1 < s2) {
            HashMap<Character, Integer> tmp = hm1;
            hm1 = hm2;
            hm2 = tmp;
        }

        int result = 0;
        // loop longer map
        for (Map.Entry<Character, Integer> entry : hm1.entrySet()) {
            char c1 = entry.getKey();
            if (hm2.containsKey(c1)) {
                result = result + Math.abs(entry.getValue() - hm2.get(c1));
                //Substract and then apply absulate
            } else {
                result = result + hm1.get(c1);
            }
        }

        return result;

    }
    public static void main(String[] args) {
        System.out.println(DeletionDistance.deletionDistance2("dgo", "frog"));

        //System.out.println(Solution.deletionDistance("some", "some"));
        //System.out.println(DeletionDistance.deletionDistance("entertainment", "trainee"));

        //System.out.println(DeletionDistance.deletionDistance2("dog", "frog"));
    }

}
/*
// ht

// ht
6 - 6 = 0
 1 d
 2 d
 3 d
dog | d = 0 o = 0 g = 0 h1

god | g = 0 o = 0 d = 0 h2

1 d
1 d

length dog = 3
length frog = 4
delete 4
  dog + frog - delete
  3

h1 = d = 1 , o = 1, f = 1
str1 = "dof",

h2 = f = 1 , r = 1, o = 1 g = 1
str2 = "frog"


 entertainment
 aeeinrt
 aeeinrt

 deletion = 6

 h1 = e = 3, n = 2, t = 3, r = 1, i = 1, m = 1, a = 1

 trainee
 h2 = t = 1 , r = 1 , a = 1, i = 1 , n = 1 , e = 2


 2 d e
 1 d n
 1 d t
 1 d r
 1 d i
 0 d m
 1 d a

 (13 + 7) - 14 = 6

 */
 
