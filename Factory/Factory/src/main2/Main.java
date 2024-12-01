package main2;

import factory2.ShapeFactory;
import shapes.Shape;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // Crear un círculo
        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();

        // Crear un cuadrado
        Shape square = shapeFactory.getShape("SQUARE");
        square.draw();
    }
}
