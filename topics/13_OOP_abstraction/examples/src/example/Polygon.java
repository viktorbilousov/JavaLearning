package example;

// Class for Polygons
abstract class Polygon implements Shape, Rotatable {
    int angles;

    @Override
    public void rotate(double angle) {
        System.out.println("Rotating polygon by " + angle + " degrees.");
    }
}


