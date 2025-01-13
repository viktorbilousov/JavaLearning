package example;

// Equilateral Triangle class
class EquilateralTriangle extends Triangle {

    EquilateralTriangle(double side) {
        super(side, side, side, Math.sqrt(3) / 2 * side);
    }
}


