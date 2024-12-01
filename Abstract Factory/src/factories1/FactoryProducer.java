package factories1;

public class FactoryProducer {
    public static AbstractFactory getFactory(String factoryType) {
        if (factoryType.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        } else if (factoryType.equalsIgnoreCase("STYLE")) {
            return new StyleFactory();
        }
        return null;
    }
}
