package edu.geometry.client;

import edu.geometry.Circle;
import edu.geometry.Rectangle;
import edu.geometry.Shape;
import edu.geometry.Triangle;

class ShapeClient {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2.3, 2.2);
        Shape triangle = new Triangle(2.7, 3.8, 30);
        Shape circle = new Circle(2.5);

        Shape[] shapes = {rectangle, triangle, circle};
        double sum = 0;

        for (Shape shape : shapes) {
            double area = shape.getArea();
            sum += area;
            System.out.println(area);
        }

        System.out.println("Sum of all areas is: " + sum);
    }
}