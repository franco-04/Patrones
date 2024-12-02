package state1;

public class HasCoinState implements State {
    private VendingMachine vendingMachine;

    public HasCoinState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Ya has insertado una moneda.");
    }

    @Override
    public void ejectCoin() {
        System.out.println("Moneda devuelta.");
        vendingMachine.setState(vendingMachine.getNoCoinState());
    }

    @Override
    public void selectProduct() {
        System.out.println("Producto seleccionado. Dispensando...");
        vendingMachine.setState(vendingMachine.getDispensingState());
    }

    @Override
    public void dispense() {
        System.out.println("Selecciona un producto primero.");
    }
}
