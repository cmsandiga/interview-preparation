package geekforgeek;

import java.util.*;

/**
 * Created by makoto on 25/06/17.
 */
public class OrderedSumPair {


    public static int bruteforce(int[] arr1, int[] arr2, int x) {

        int count = 0;

        // Time Complexity = O(N*M)
        // Space Complexity = O(N) where N is the number of pairs.

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {

                if (arr1[i] + arr2[j] == x) {
                    count++;
                }
            }
        }


        return count;
    }

    public static int optimalSolution(int[] arr1, int[] arr2, int x) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            set.add(x - arr1[i]);
        }

        int counter = 0;

        for (int i = 0; i < arr2.length; i++) {
            if (set.contains(arr2[i])) {
                counter++;
            }

        }
        return counter;
    }

    public static int optimalSolutionSecondGeekForGeek(int[] arr1, int[] arr2, int x) {

        int left = 0;
        int right = arr2.length - 1;

        int counter = 0;

        while (left < arr1.length && right >= 0) {

            int sum = arr1[left] + arr2[right];

            if (sum == x) {
                counter++;
                left++;
                right--;

            } else if (sum < x) {
                left++;
            } else {
                right--;
            }

        }

        return counter;
    }

    static class Pair {
        int a;
        int b;
    }
}

