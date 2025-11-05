class ResistorColor {
    private static final String[] COLOR_ARRAY = {
            "black", "brown", "red", "orange", "yellow",
            "green", "blue", "violet", "grey", "white"
    };

    int colorCode(String color) {
        for (int i = 0; i < COLOR_ARRAY.length; i++) {
            if (COLOR_ARRAY[i].equals(color)) {
                return i;
            }
        }
        return -1;
    }

    String[] colors() {
        return COLOR_ARRAY.clone();
    }
}
