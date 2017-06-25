package geekforgeek;

import util.Pair;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by makoto on 25/06/17.
 */
public class OrderedModPair {

    public List<Pair> findPairs(int[] arr, int k) {

        List<Pair> pairs = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] % arr[j] == k) {
                    pairs.add(new Pair(arr[i], arr[j]));
                }
            }
        }

        return pairs;
    }


}

