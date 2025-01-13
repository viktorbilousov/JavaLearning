package example;

// Quadrilateral class
class Quadrilateral extends Polygon {
    double sideA;
    double sideB;
    double sideC;
    double sideD;

    Quadrilateral(double sideA, double sideB, double sideC, double sideD) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
        this.angles = 4;
    }

    @Override
    public double getArea() {
        // Simplified for a rectangle; can vary based on type
        return sideA * sideB;
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC + sideD;
    }
}