package main1;

import builder1.Casa;

public class Principal {
    public static void main(String[] args) {
        // Construir una casa básica
        Casa casaBasica = new Casa.Constructor()
                .establecerParedes(4)
                .establecerPuertas(1)
                .establecerVentanas(4)
                .establecerTecho(true)
                .construir();

        System.out.println("Casa básica:");
        System.out.println(casaBasica);

        // Construir una casa de lujo
        Casa casaDeLujo = new Casa.Constructor()
                .establecerParedes(6)
                .establecerPuertas(3)
                .establecerVentanas(8)
                .establecerTecho(true)
                .establecerGaraje(true)
                .establecerPiscina(true)
                .construir();

        System.out.println("\nCasa de lujo:");
        System.out.println(casaDeLujo);
    }
}
