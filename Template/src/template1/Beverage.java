package template1;

public abstract class Beverage {

    // Método plantilla
    public final void prepareBeverage() {
        boilWater();
        brew();
        pourInCup();
        if (addCondimentsRequired()) {
            addCondiments();
        }
    }

    // Método concreto (parte fija del algoritmo)
    private void boilWater() {
        System.out.println("Hirviendo agua...");
    }

    // Método concreto (parte fija del algoritmo)
    private void pourInCup() {
        System.out.println("Vertiendo en la taza...");
    }

    // Método abstracto (personalizado por subclases)
    protected abstract void brew();

    // Método abstracto (personalizado por subclases)
    protected abstract void addCondiments();

    // Gancho (opcional para subclases)
    protected boolean addCondimentsRequired() {
        return true;
    }
}
