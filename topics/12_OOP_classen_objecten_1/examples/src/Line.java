package com.vib;

public class Line {
    private Point pointA;
    private Point pointB;

    public Line(Point pointA, Point pointB) {
        this.pointA = pointA;
        this.pointB = pointB;
    }

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    @Override
    public String toString() {
        return "Line{" +
                "pointA=" + pointA.getX() + " " + pointA.getY() +
                ", pointB=" + pointB.getX() + " " + pointB.getY() +
                '}';
    }
}
