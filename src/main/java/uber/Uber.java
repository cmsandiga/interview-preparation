package uber;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by makoto on 21/05/17.
 */
public class Uber {


    public static String solve(String dna) {

        Map<String, Integer> mapGenes = new HashMap<>();
        mapGenes.put("ACT", 0);
        mapGenes.put("AGT", 0);
        mapGenes.put("CGT", 0);

        String bestDNA = "";

        int uniqueGenesCounter = 0;

        int tail = 0, head = 0;

        while (head + 3 <= dna.length()) {

            String geneKey = dna.substring(head, head + 3);

            Integer geneCounter = mapGenes.get(geneKey);

            if (geneCounter == null) {
                head++;
                continue;
            }

            if (geneCounter == 0) {
                uniqueGenesCounter++;
            }

            mapGenes.put(geneKey, ++geneCounter);

            while (uniqueGenesCounter == 3) {

                if (isBestDNA(tail, head)) return dna.substring(tail, head + 3);

                if (bestDNA.isEmpty() || (head + 3) - tail < bestDNA.length()) {
                    bestDNA = dna.substring(tail, head + 3);
                }

                String tailGeneKey = dna.substring(tail, tail + 3);

                Integer tailGeneCounter = mapGenes.get(tailGeneKey);

                if (tailGeneCounter == null) {
                    tail++;
                } else {
                    tailGeneCounter--;
                    tail += 3;

                    mapGenes.put(tailGeneKey, tailGeneCounter);

                    if (tailGeneCounter == 0) {
                        uniqueGenesCounter--;
                    }
                }
            }
            head++;
        }

        return bestDNA;
    }

    private static boolean isBestDNA(int tail, int head) {
        return (head + 3) - tail == 9;
    }
}
