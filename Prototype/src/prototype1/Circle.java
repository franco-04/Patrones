package prototype1;

public class Circle extends Shape {
    public Circle() {
        setType("Círculo");
    }

    @Override
    public void draw() {
        System.out.println("Dibujando un círculo.");
    }
}
