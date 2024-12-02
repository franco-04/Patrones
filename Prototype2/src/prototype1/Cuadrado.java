package prototype1;

public class Cuadrado extends Figura {
    public Cuadrado() {
        setTipo("Cuadrado");
    }

    @Override
    public Figura clonar() {
        Cuadrado clon = new Cuadrado();
        clon.setId(this.getId());
        return clon;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un cuadrado.");
    }
}
