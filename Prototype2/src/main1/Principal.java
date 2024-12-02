package main1;

import prototype1.Figura;
import prototype1.FiguraCache;

public class Principal {
    public static void main(String[] args) {
        // Cargar los prototipos en el cache
        FiguraCache.cargarFiguras();

        // Obtener y clonar un círculo
        Figura figura1 = FiguraCache.obtenerFigura("1");
        System.out.println("Figura: " + figura1.getTipo());
        figura1.dibujar();

        // Obtener y clonar un cuadrado
        Figura figura2 = FiguraCache.obtenerFigura("2");
        System.out.println("Figura: " + figura2.getTipo());
        figura2.dibujar();
    }
}
