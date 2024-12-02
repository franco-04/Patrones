package main1;

import template1.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Preparando té:");
        Beverage tea = new Tea();
        tea.prepareBeverage();

        System.out.println("\nPreparando café:");
        Beverage coffee = new Coffee();
        coffee.prepareBeverage();
    }
}
