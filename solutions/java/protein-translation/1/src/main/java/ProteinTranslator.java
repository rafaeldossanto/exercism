import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class ProteinTranslator {

    private static final Map<String, String> CODON_TO_PROTEIN = Map.ofEntries(
            Map.entry("AUG", "Methionine"),
            Map.entry("UUU", "Phenylalanine"),
            Map.entry("UUC", "Phenylalanine"),
            Map.entry("UUA", "Leucine"),
            Map.entry("UUG", "Leucine"),
            Map.entry("UCU", "Serine"),
            Map.entry("UCC", "Serine"),
            Map.entry("UCA", "Serine"),
            Map.entry("UCG", "Serine"),
            Map.entry("UAU", "Tyrosine"),
            Map.entry("UAC", "Tyrosine"),
            Map.entry("UGU", "Cysteine"),
            Map.entry("UGC", "Cysteine"),
            Map.entry("UGG", "Tryptophan"),
            Map.entry("UAA", "STOP"),
            Map.entry("UAG", "STOP"),
            Map.entry("UGA", "STOP")
    );


    List<String> translate(String rnaSequence) {
        final List<String> proteins = new ArrayList<>();

        for (int i = 0; i < rnaSequence.length(); i += 3) {
            if (i + 3 > rnaSequence.length()) {
                throw new IllegalArgumentException("Invalid codon");
            }

            String codon = rnaSequence.substring(i, i + 3);

            String protein = CODON_TO_PROTEIN.get(codon);

            if (protein == null) {
                throw new IllegalArgumentException("Invalid codon");
            }

            if (protein.equals("STOP")) {
                break;
            }

            proteins.add(protein);
        }

        return proteins;
    }
}
