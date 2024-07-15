package edu.geometry.client;

import edu.geometry.Circle;
import edu.geometry.Rectangle;
import edu.geometry.Shape;
import edu.geometry.Triangle;

class ShapeClient {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(-3, 4);
        Shape triangle = new Triangle(5, 10, 30);
        Shape circle = new Circle(5);

        Shape[] shapes = {rectangle, triangle, circle};

        for (Shape shape : shapes) {
            System.out.println(shape.getArea());
        }
    }
}