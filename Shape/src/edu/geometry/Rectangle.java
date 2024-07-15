package edu.geometry;

public class Rectangle implements Shape {
    private int length;
    private int width;

    public Rectangle(int length, int width) throws IllegalArgumentException {
        if (length < 0 || width < 0) {
            throw new IllegalArgumentException("Length and width should be non-negative");
        }
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
}