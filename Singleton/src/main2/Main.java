package main2;

import singleton1.Logger;

public class Main {
    public static void main(String[] args) {
        // Obtén la instancia del Singleton
        Logger logger1 = Logger.getInstance();
        logger1.log("Este es el primer mensaje.");

        // Obtén la instancia del Singleton otra vez
        Logger logger2 = Logger.getInstance();
        logger2.log("Este es el segundo mensaje.");

        // Comprueba si ambas instancias son iguales
        if (logger1 == logger2) {
            System.out.println("Ambas referencias apuntan a la misma instancia.");
        } else {
            System.out.println("Las referencias son diferentes (esto no debería suceder).");
        }
    }
}
