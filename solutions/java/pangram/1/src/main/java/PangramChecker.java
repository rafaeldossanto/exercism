public class PangramChecker {

    public boolean isPangram(String input) {
        int mask = 0;
        final int FULL = (1 << 26) - 1;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                c = (char) (c + ('a' - 'A'));
            }

            if (c >= 'a' && c <= 'z') {
                mask |= 1 << (c - 'a');
                if (mask == FULL) return true;
            }
        }

        return mask == FULL;
    }

}
