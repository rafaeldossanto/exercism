
class ResistorColorDuo {
    static String[] cores = {
            "black", "brown", "red", "orange", "yellow",
            "green", "blue", "violet", "grey", "white"
    };

    int value(String[] colors) {
        int firstDigit = getColorValue(colors[0]);
        int secondDigit = getColorValue(colors[1]);

        return firstDigit * 10 + secondDigit;
    }

    private int getColorValue(String color) {
        for (int i = 0; i < cores.length; i++) {
            if (color.equals(cores[i])) {
                return i;
            }
        }
        return -1;
    }
}
