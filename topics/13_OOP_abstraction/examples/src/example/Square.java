package example;

// Square class
class Square extends Quadrilateral {

    Square(double side) {
        super(side, side, side, side);
    }

    @Override
    public double getArea() {
        return sideA * sideA;
    }
}