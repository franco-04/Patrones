package main1;

import decorator1.*;

public class Main {
    public static void main(String[] args) {
        // Texto simple
        Text plainText = new PlainText("Hola, mundo!");
        System.out.println("Texto simple:");
        System.out.println(plainText.render());

        // Texto con borde
        Text borderedText = new BorderDecorator(plainText);
        System.out.println("\nTexto con borde:");
        System.out.println(borderedText.render());

        // Texto en mayúsculas
        Text upperCaseText = new UpperCaseDecorator(plainText);
        System.out.println("\nTexto en mayúsculas:");
        System.out.println(upperCaseText.render());

        // Texto con borde y mayúsculas
        Text complexText = new UpperCaseDecorator(new BorderDecorator(plainText));
        System.out.println("\nTexto con borde y en mayúsculas:");
        System.out.println(complexText.render());
    }
}
