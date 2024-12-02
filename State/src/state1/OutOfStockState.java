package state1;

public class OutOfStockState implements State {
    private VendingMachine vendingMachine;

    public OutOfStockState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("La máquina está fuera de servicio.");
    }

    @Override
    public void ejectCoin() {
        System.out.println("No hay monedas para devolver. La máquina está vacía.");
    }

    @Override
    public void selectProduct() {
        System.out.println("No hay productos disponibles.");
    }

    @Override
    public void dispense() {
        System.out.println("No hay productos para dispensar.");
    }
}
