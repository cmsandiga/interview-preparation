package pramp.interviewee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by makoto on 20/02/17.
 * <p>
 * Quad Combination
 * <p>
 * Given an array of numbers arr and a number S, find 4 different numbers in arr that sum up to S.
 * <p>
 * Write a function that gets arr and S and returns an array with 4 indices of such numbers in arr, or null if no such combination exists.
 * Explain and code the most efficient solution possible, and analyze its runtime and space complexity.
 */
public class QuadSum {


    public int[] quadsum(int[] a, int s) {

        Map<Integer, List<Pair>> hm = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                int key = a[i] + a[j];
                List<Pair> pairs = hm.get(key);

                if (pairs == null)
                    pairs = new ArrayList<>();

                pairs.add(new Pair(i, j));
                hm.put(key, pairs);
            }
        }

        for (Map.Entry<Integer, List<Pair>> entry : hm.entrySet()) {
            List<Pair> pairs = hm.get(s - entry.getKey());
            if (pairs != null) {
                Pair current = entry.getValue().get(0);
                for (Pair pair : pairs) {
                    if (current.i != pair.i && current.j != pair.j) {
                        return new int[]{current.i, current.j, pair.i, pair.j};
                    }
                }
            }

        }
        return new int[]{};
    }

    class Pair {
        private int i;
        private int j;

        public Pair(int i, int j) {
            this.i = i;
            this.j = j;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (i != pair.i) return false;
            return j == pair.j;
        }

        @Override
        public int hashCode() {
            int result = i;
            result = 31 * result + j;
            return result;
        }
    }
}
