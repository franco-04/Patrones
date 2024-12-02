package prototype1;

public abstract class Shape implements Prototype, Cloneable {
    private String id;
    private String type;

    // Métodos getter y setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // Método abstracto que será implementado por las subclases
    public abstract void draw();

    // Implementación del método clone
    @Override
    public Shape clone() {
        try {
            return (Shape) super.clone(); // Clonación superficial
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Error al clonar el objeto.", e);
        }
    }
}
