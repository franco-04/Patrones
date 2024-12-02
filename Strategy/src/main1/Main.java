package main1;

import Strategy1.*;

public class Main {
    public static void main(String[] args) {
        double price = 100.0;

        // Usar estrategia para cliente regular
        ShoppingCart cart = new ShoppingCart(new RegularCustomerStrategy());
        System.out.println("Total para cliente regular: " + cart.calculateTotal(price));

        // Cambiar a estrategia para cliente VIP
        cart.setDiscountStrategy(new VIPCustomerStrategy());
        System.out.println("Total para cliente VIP: " + cart.calculateTotal(price));

        // Cambiar a estrategia sin descuento
        cart.setDiscountStrategy(new NoDiscountStrategy());
        System.out.println("Total sin descuento: " + cart.calculateTotal(price));
    }
}
