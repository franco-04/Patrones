package prototype1;

public class Circulo extends Figura {
    public Circulo() {
        setTipo("Círculo");
    }

    @Override
    public Figura clonar() {
        Circulo clon = new Circulo();
        clon.setId(this.getId());
        return clon;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un círculo.");
    }
}
