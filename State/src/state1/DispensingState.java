package state1;

public class DispensingState implements State {
    private VendingMachine vendingMachine;

    public DispensingState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Espera, estamos dispensando tu producto.");
    }

    @Override
    public void ejectCoin() {
        System.out.println("No puedes devolver la moneda mientras dispensamos.");
    }

    @Override
    public void selectProduct() {
        System.out.println("Ya estamos dispensando un producto.");
    }

    @Override
    public void dispense() {
        System.out.println("Producto dispensado. ¡Gracias!");
        vendingMachine.setState(vendingMachine.getNoCoinState());
    }
}
