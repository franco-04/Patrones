package template1;

public class Coffee extends Beverage {
    @Override
    protected void brew() {
        System.out.println("Filtrando el café...");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Añadiendo azúcar y leche...");
    }

    @Override
    protected boolean addCondimentsRequired() {
        return true; // Puedes cambiar esto para omitir condimentos
    }
}
