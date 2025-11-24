public class Hamming {
    final String leftStr;
    final String rightStr;

    public Hamming(String leftStrand, String rightStrand) {
        if (leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException("strands must be of equal length");
        }
        this.leftStr = leftStrand;
        this.rightStr = rightStrand;
    }

    public int getHammingDistance() {
        char[] left = leftStr.toCharArray();
        char[] right = rightStr.toCharArray();

        int distance = 0;
        for (int i = 0; i < left.length; i++) {
            if (left[i] != right[i]) {
                distance++;
            }
        }
        return distance;
    }
}
