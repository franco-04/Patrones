package state1;

public class NoCoinState implements State {
    private VendingMachine vendingMachine;

    public NoCoinState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Moneda insertada. Puedes seleccionar un producto.");
        vendingMachine.setState(vendingMachine.getHasCoinState());
    }

    @Override
    public void ejectCoin() {
        System.out.println("No hay moneda para devolver.");
    }

    @Override
    public void selectProduct() {
        System.out.println("Inserta una moneda primero.");
    }

    @Override
    public void dispense() {
        System.out.println("Paga antes de intentar dispensar.");
    }
}
