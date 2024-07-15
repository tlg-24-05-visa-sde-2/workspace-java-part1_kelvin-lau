package edu.geometry;

public class Rectangle implements Shape {
    private final double length;
    private final double width;

    public Rectangle(double length, double width) throws IllegalArgumentException {
        if (length < 0 || width < 0) {
            throw new IllegalArgumentException("Length and width should be non-negative");
        }
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return getLength() * getWidth();
    }

    @Override
    public double getPerimeter() {
        return 2 * (getLength() + getWidth());
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}