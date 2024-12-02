package main1;

import observer1.*;

public class Main {
    public static void main(String[] args) {
        // Crear el sujeto (canal de noticias)
        NewsChannel channel = new NewsChannel();

        // Crear observadores (suscriptores)
        Subscriber subscriber1 = new Subscriber("Suscriptor 1");
        Subscriber subscriber2 = new Subscriber("Suscriptor 2");
        Subscriber subscriber3 = new Subscriber("Suscriptor 3");

        // Registrar los observadores
        channel.registerObserver(subscriber1);
        channel.registerObserver(subscriber2);
        channel.registerObserver(subscriber3);

        // Publicar una noticia
        System.out.println("Publicando la primera noticia:");
        channel.publishNews("¡Java es increíble!");

        // Eliminar un observador
        channel.removeObserver(subscriber2);

        // Publicar otra noticia
        System.out.println("\nPublicando la segunda noticia:");
        channel.publishNews("El patrón Observer es útil.");
    }
}
