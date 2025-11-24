class ResistorColorTrio {
    public final String[] resistors = {
            "black", "brown", "red", "orange", "yellow",
            "green", "blue", "violet", "grey", "white"
    };

    String label(String[] colors) {
        int color1 = -1;
        int color2 = -1;

        for (int i = 0; i < resistors.length; i++) {
            if (resistors[i].equals(colors[0])) {
                color1 = i;
                break;
            }
        }

        for (int i = 0; i < resistors.length; i++) {
            if (resistors[i].equals(colors[1])) {
                color2 = i;
                break;
            }
        }

        int baseValue = color1 * 10 + color2;

        int multiplierIndex = -1;
        for (int i = 0; i < resistors.length; i++) {
            if (resistors[i].equals(colors[2])) {
                multiplierIndex = i;
                break;
            }
        }

        long value = (long) (baseValue * Math.pow(10, multiplierIndex));

        if (value >= 1_000_000_000) {
            return (value / 1_000_000_000) + " gigaohms";
        } else if (value >= 1_000_000) {
            return (value / 1_000_000) + " megaohms";
        } else if (value >= 1_000) {
            return (value / 1_000) + " kiloohms";
        } else {
            return value + " ohms";
        }
    }
}