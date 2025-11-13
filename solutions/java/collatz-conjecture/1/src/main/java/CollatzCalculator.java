class CollatzCalculator {

    int computeStepCount(int start) {
        while (start != 1) {
            if (start % 2 == 0) {
                start = start / 2;
            } else {
                start = start * 3 + 1;
            }
        }
        return start;
    }
}