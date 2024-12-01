package factories1;

import shapes1.Circle;
import shapes1.Shape;
import shapes1.Square;
import styles1.Style;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }

    @Override
    public Style getStyle(String styleType) {
        return null; // No aplica para ShapeFactory
    }
}
