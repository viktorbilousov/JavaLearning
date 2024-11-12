package com.vib;

public class IntPoint {
    public int x;
    public int y;

    public IntPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public IntPoint() {
        this(0,0);
    }

    public void incrementAll(){
        this.x++;
        this.y++;
    }

    @Override
    public String toString() {
        return "IntPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IntPoint)) return false;

        IntPoint intPoint = (IntPoint) o;

        if (x != intPoint.x) return false;
        return y == intPoint.y;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }

}
