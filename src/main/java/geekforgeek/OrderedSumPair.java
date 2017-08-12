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

// Dada uma string contendo uma sequência de DNA (de tamanho N) e um inteiro K,
// implemente um método que retorne todas as sub-sequencias de tamanho K que se
// repetem ao menos uma vez na sequência original.
//
// Exemplo:
// Entrada: s = "ATAGATACGATA", k = 3
// Retorno esperado: { "ATA", "GAT" }

        public List<String> containsDNA(String dna, int k){

            if(StringUtils.isEmpty(dna)){
                return Collections.emptyList();
            }

            if(dna.length() <= k)
                return Collections.emptyList();
        }

        Map<String, Integer> frequencyDna = new HashMap<String,Integer>();

        for(int i = 0; i + k < dna.length(); i++){
            String key = dna.subString(i, i + k);

            Integer value = frequencyDna.get(key);

            if(value == null){
                frequencyDna.put(key, 0);
            }

            frequencyDna.put(key, value++);
        }

        List<String> result = new ArrayList<>();

        for(Entry<String, Integer> entry : frequencyDna.entrySet()){

            if(entry.getValue() > 1){
                result.add(entry.getKe());
            }
        }

        return result;
    }
        return count;
    }

    public static int optimalSolution(int[] arr1, int[] arr2, int x) {
        Set<String> set = new HashSet<>();

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

