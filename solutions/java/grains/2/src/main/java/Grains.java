import java.math.BigInteger;

class Grains {
    long grains = 0;

    BigInteger grainsOnSquare(final int square) {
        if (square <= 0 || square >= 65) {
            throw new IllegalArgumentException("square must be between 1 and 64");
        }
        return BigInteger.valueOf((long) Math.pow(2, square - 1));
    }

    BigInteger grainsOnBoard() {
        for (int i = 0; i < 64; i++) {
            grains += Math.pow(2, i);
        }
        return BigInteger.valueOf(grains);
    }
}
