package main1;

import prototype1.Shape;
import prototype1.ShapeCache;

public class Main {
    public static void main(String[] args) {
        // Cargar los prototipos en la caché
        ShapeCache.loadCache();

        // Clonar objetos a partir de los prototipos
        Shape clonedShape1 = ShapeCache.getShape("1");
        System.out.println("Objeto clonado: " + clonedShape1.getType());
        clonedShape1.draw();

        Shape clonedShape2 = ShapeCache.getShape("2");
        System.out.println("Objeto clonado: " + clonedShape2.getType());
        clonedShape2.draw();
    }
}
