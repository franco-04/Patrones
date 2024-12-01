package factories1;

import shapes1.Shape;
import styles1.Style;

public abstract class AbstractFactory {
    public abstract Shape getShape(String shapeType);
    public abstract Style getStyle(String styleType);
}
