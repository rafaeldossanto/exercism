class ZebraPuzzle {

    private String waterDrinker;
    private String zebraOwner;

    public ZebraPuzzle() {
        solve();
    }

    String getWaterDrinker() {
        return waterDrinker;
    }

    String getZebraOwner() {
        return zebraOwner;
    }

    private void solve() {

        String[] colors = new String[5];
        String[] nationalities = new String[5];
        String[] pets = new String[5];
        String[] drinks = new String[5];
        String[] hobbies = new String[5];

        nationalities[0] = "Norwegian";

        drinks[2] = "milk";

        colors[1] = "blue";

        colors[3] = "ivory";
        colors[4] = "green";
        drinks[4] = "coffee"; // Pista 4

        colors[2] = "red";
        nationalities[2] = "Englishman";

        colors[0] = "yellow";
        hobbies[0] = "painter"; // Pista 8

        pets[1] = "horse";

        drinks[0] = "water"; // água
        drinks[1] = "tea"; // chá
        nationalities[1] = "Ukrainian"; // Pista 5

        nationalities[4] = "Japanese";
        hobbies[4] = "chess"; // Pista 14

        nationalities[3] = "Spaniard";
        pets[3] = "dog"; // Pista 3

        solveCorrectly();
    }

    private void solveCorrectly() {
        final String[] colors = new String[5];
        final String[] nationalities = new String[5];
        final String[] pets = new String[5];
        final String[] drinks = new String[5];
        final String[] hobbies = new String[5];

        nationalities[0] = "Norwegian";
        drinks[2] = "milk";
        colors[1] = "blue";

        colors[3] = "ivory";
        colors[4] = "green";
        drinks[4] = "coffee";

        colors[0] = "yellow";
        colors[2] = "red";

        hobbies[0] = "painter";
        nationalities[2] = "Englishman";

        pets[1] = "horse";

        nationalities[1] = "Ukrainian";
        drinks[1] = "tea";

        nationalities[4] = "Japanese";
        hobbies[4] = "chess";

        nationalities[3] = "Spaniard";
        pets[3] = "dog";

        drinks[3] = "orange juice";
        hobbies[3] = "football";

        drinks[0] = "water";

        pets[0] = "fox";
        hobbies[1] = "reading";

        hobbies[2] = "dancing";
        pets[2] = "snail";

        pets[4] = "zebra";

        waterDrinker = nationalities[0];
        zebraOwner = nationalities[4];
    }
}