package prototype1;

public abstract class Figura implements Prototype {
    private String id;
    private String tipo;

    // Getters y setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public abstract Figura clonar();

    public abstract void dibujar();
}
