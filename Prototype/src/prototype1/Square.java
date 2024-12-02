package prototype1;

public class Square extends Shape {
    public Square() {
        setType("Cuadrado");
    }

    @Override
    public void draw() {
        System.out.println("Dibujando un cuadrado.");
    }
}
