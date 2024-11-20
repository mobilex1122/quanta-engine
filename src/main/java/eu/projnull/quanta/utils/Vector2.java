package eu.projnull.quanta.utils;

public class Vector2 {
    private double x;
    private double y;

    public Vector2(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Vector2 add(Vector2 other) {
        return new Vector2(this.x + other.x, this.y + other.y);
    }

    public Vector2 subtract(Vector2 other) {
        return new Vector2(this.x - other.x, this.y - other.y);
    }

    public double dot(Vector2 other) {
        return this.x * other.x + this.y * other.y;
    }

    public double magnitude() {
        return Math.sqrt(x * x + y * y);
    }

    public Vector2 normalize() {
        double mag = magnitude();
        return new Vector2(x / mag, y / mag);
    }

    @Override
    public String toString() {
        return "Vector2(" + x + ", " + y + ")";
    }
}
