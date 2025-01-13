package example;

// Triangle class
class Triangle extends Polygon {
    double sideA;
    double sideB;
    double sideC;
    double height;

    Triangle(double sideA, double sideB, double sideC, double height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.height = height;
        this.angles = 3;
    }

    @Override
    public double getArea() {
        return (sideA * height) / 2;
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }
}
