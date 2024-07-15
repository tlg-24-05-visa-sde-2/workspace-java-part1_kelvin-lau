package edu.geometry;

public class Triangle implements Shape {
    private final double side1;
    private final double side2;
    private final double angle;

    public Triangle(double side1, double side2, double angle) throws IllegalArgumentException {
        if (side1 <= 0 || side2 <= 0 || angle <= 0) {
            throw new IllegalArgumentException("Sides and/or angle cannot be less than or equal to 0");
        }
        this.side1 = side1;
        this.side2 = side2;
        this.angle = Math.toRadians(angle);
    }

    @Override
    public double getArea() {
        return 0.5 * getSide1() * getSide2() * Math.sin(getAngle());
    }

    @Override
    public double getPerimeter() {
        return 1;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getAngle() {
        return angle;
    }
}