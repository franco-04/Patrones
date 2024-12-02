package builder1;

// Producto final: Casa
public class Casa {
    private int paredes;
    private int puertas;
    private int ventanas;
    private boolean tieneTecho;
    private boolean tieneGaraje;
    private boolean tienePiscina;

    // Constructor privado
    private Casa(Constructor constructor) {
        this.paredes = constructor.paredes;
        this.puertas = constructor.puertas;
        this.ventanas = constructor.ventanas;
        this.tieneTecho = constructor.tieneTecho;
        this.tieneGaraje = constructor.tieneGaraje;
        this.tienePiscina = constructor.tienePiscina;
    }

    // Getters para mostrar los detalles
    public int getParedes() {
        return paredes;
    }

    public int getPuertas() {
        return puertas;
    }

    public int getVentanas() {
        return ventanas;
    }

    public boolean tieneTecho() {
        return tieneTecho;
    }

    public boolean tieneGaraje() {
        return tieneGaraje;
    }

    public boolean tienePiscina() {
        return tienePiscina;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "paredes=" + paredes +
                ", puertas=" + puertas +
                ", ventanas=" + ventanas +
                ", tieneTecho=" + tieneTecho +
                ", tieneGaraje=" + tieneGaraje +
                ", tienePiscina=" + tienePiscina +
                '}';
    }

    // Clase estática interna para el Constructor
    public static class Constructor {
        private int paredes;
        private int puertas;
        private int ventanas;
        private boolean tieneTecho;
        private boolean tieneGaraje;
        private boolean tienePiscina;

        // Métodos para establecer propiedades
        public Constructor establecerParedes(int paredes) {
            this.paredes = paredes;
            return this;
        }

        public Constructor establecerPuertas(int puertas) {
            this.puertas = puertas;
            return this;
        }

        public Constructor establecerVentanas(int ventanas) {
            this.ventanas = ventanas;
            return this;
        }

        public Constructor establecerTecho(boolean tieneTecho) {
            this.tieneTecho = tieneTecho;
            return this;
        }

        public Constructor establecerGaraje(boolean tieneGaraje) {
            this.tieneGaraje = tieneGaraje;
            return this;
        }

        public Constructor establecerPiscina(boolean tienePiscina) {
            this.tienePiscina = tienePiscina;
            return this;
        }

        // Método para construir el producto final
        public Casa construir() {
            return new Casa(this);
        }
    }
}
