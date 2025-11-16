class Darts {
    int score(double xOfDart, double yOfDart) {
        double diagonal =  Math.sqrt(Math.pow(xOfDart, 2) + Math.pow(yOfDart, 2));

        if (diagonal <= 1) return 10;
        else if (diagonal <= 5) return 5;
        else if (diagonal <= 10) return 1;
        else return 0;
    }
}
