package template1;

public class Tea extends Beverage {
    @Override
    protected void brew() {
        System.out.println("Infusionando el té...");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Añadiendo limón...");
    }
}
