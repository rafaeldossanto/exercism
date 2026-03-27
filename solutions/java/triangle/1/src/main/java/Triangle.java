class Triangle {
    private final double side1, side2, side3;

    Triangle(double side1, double side2, double side3) throws TriangleException {
        validateTriangle(side1, side2, side3);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    boolean isEquilateral() {
        return side1 == side2 && side2 == side3;
    }

    boolean isIsosceles() {
        return side1 == side2 || side1 == side3 || side2 == side3;
    }

    boolean isScalene() {
        return side1 != side2 && side1 != side3 && side2 != side3;
    }

    private void validateTriangle(double a, double b, double c) throws TriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new TriangleException("All sides must be positive");
        }

        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new TriangleException("Triangle inequality violation");
        }
    }
}