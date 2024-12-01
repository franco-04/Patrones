package factories1;

import shapes1.Shape;
import styles1.OutlineStyle;
import styles1.SolidStyle;
import styles1.Style;

public class StyleFactory extends AbstractFactory {
    @Override
    public Style getStyle(String styleType) {
        if (styleType == null) {
            return null;
        }
        if (styleType.equalsIgnoreCase("SOLID")) {
            return new SolidStyle();
        } else if (styleType.equalsIgnoreCase("OUTLINE")) {
            return new OutlineStyle();
        }
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        return null; // No aplica para StyleFactory
    }
}
