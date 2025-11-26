import java.util.ArrayList;
import java.util.List;

class DiamondPrinter {

    List<String> printToList(char a) {
        List<String> result = new ArrayList<>();
        int size = a - 'A';

        for (int i = 0; i <= size; i++) {
            result.add(generateLine(i, size));
        }

        for (int i = size - 1; i >= 0; i--) {
            result.add(generateLine(i, size));
        }

        return result;
    }

    private String generateLine(int current, int size) {
        char letter = (char) (current + 'A');
        int outerSpaces = size - current;
        int innerSpaces = 2 * current - 1;

        StringBuilder line = new StringBuilder();

        for (int i = 0; i < outerSpaces; i++) {
            line.append(' ');
        }

        line.append(letter);

        if (current > 0) {
            for (int i = 0; i < innerSpaces; i++) {
                line.append(' ');
            }
            line.append(letter);
        }

        for (int i = 0; i < outerSpaces; i++) {
            line.append(' ');
        }

        return line.toString();
    }
}
