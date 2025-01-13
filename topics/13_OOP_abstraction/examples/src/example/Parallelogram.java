package example;

// Parallelogram class
class Parallelogram extends Quadrilateral {

    Parallelogram(double sideA, double sideB) {
        super(sideA, sideB, sideA, sideB);
    }

    @Override
    public double getArea() {
        // Requires height; omitted for simplicity
        return 0;
    }
}
