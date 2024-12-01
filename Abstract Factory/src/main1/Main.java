package main1;

import factories1.AbstractFactory;
import factories1.FactoryProducer;
import shapes1.Shape;
import styles1.Style;

public class Main {
    public static void main(String[] args) {
        // Obtener la fábrica de formas
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        
        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();
        
        Shape square = shapeFactory.getShape("SQUARE");
        square.draw();

        // Obtener la fábrica de estilos
        AbstractFactory styleFactory = FactoryProducer.getFactory("STYLE");

        Style solid = styleFactory.getStyle("SOLID");
        solid.applyStyle();

        Style outline = styleFactory.getStyle("OUTLINE");
        outline.applyStyle();
    }
}
