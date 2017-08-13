package amazon;

import java.util.*;

public class DnaSubstring {

    // Dada uma string contendo uma sequência de DNA (de tamanho N) e um inteiro K,
// implemente um método que retorne todas as sub-sequencias de tamanho K que se
// repetem ao menos uma vez na sequência original.
//
// Exemplo:
// Entrada: s = "ATAGATACGATA", k = 3
// Retorno esperado: { "ATA", "GAT" }

    public List<String> containsDNA(String dna, int k) {

        if ("".equals(dna)) {
            return Collections.emptyList();
        }

        if (dna.length() <= k)
            return Collections.emptyList();

        Map<String, Integer> frequencyDna = new HashMap<String, Integer>();

        for (int i = 0; i + k < dna.length(); i++) {
            String key = dna.substring(i, i + k);

            Integer value = frequencyDna.get(key);

            if (value == null) {
                frequencyDna.put(key, 0);
            }

            frequencyDna.put(key, value++);
        }

        List<String> result = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : frequencyDna.entrySet()) {

            if (entry.getValue() > 1) {
                result.add(entry.getKey());
            }
        }

        return result;
    }
}
