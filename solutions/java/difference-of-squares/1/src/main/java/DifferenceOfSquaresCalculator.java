import java.util.Arrays;

class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        long sum = (long) input * (input + 1) / 2;
        return (int) (sum * sum);
    }

    int computeSumOfSquaresTo(int input) {
        int[] numbers = new int[input];
        for (int i = 0; i < input; i++) {
            numbers[i] = input-i;
        }
        return Arrays.stream(numbers).map(n -> n*n).sum();
    }

    int computeDifferenceOfSquares(int input) {
        int first = computeSquareOfSumTo(input);
        int second = computeSumOfSquaresTo(input);

        return first - second;

    }

}
