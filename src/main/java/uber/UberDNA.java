package uber;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by makoto on 21/05/17.
 */
public class UberDNA {

    public Map<String, Integer> mapGenes;

    public int sizeGenesCounter;

    public UberDNA() {
        mapGenes = new HashMap<>();
        mapGenes.put("ACT", 0);
        mapGenes.put("AGT", 0);
        mapGenes.put("CGT", 0);

        sizeGenesCounter = mapGenes.size();
    }

    public String solve(String dna) {

        String bestDNA = "";

        int uniqueGenesCounter = 0;

        int tail = 0;

        SlideWindow slideWindow = new SlideWindow(dna,0,3);

        while (slideWindow.getRight() <= dna.length()) {

            Integer geneCounter = mapGenes.get(slideWindow.getKeyByWindow());

            if (geneCounter == null) {
                slideWindow.increment();
                continue;
            }

            if (geneCounter == 0) {
                uniqueGenesCounter++;
            }

            mapGenes.put(slideWindow.getKeyByWindow(), ++geneCounter);

            while (uniqueGenesCounter == sizeGenesCounter) {

                if (isBestDNA(tail, slideWindow.getLeft())) return dna.substring(tail, slideWindow.getRight());

                if (bestDNA.isEmpty() || slideWindow.getRight() - tail < bestDNA.length()) {
                    bestDNA = dna.substring(tail, slideWindow.getRight());
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
            slideWindow.increment();
        }

        return bestDNA;
    }

    private static boolean isBestDNA(int tail, int head) {
        return (head + 3) - tail == 9;
    }
}
