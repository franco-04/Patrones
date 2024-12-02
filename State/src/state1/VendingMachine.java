package state1;

public class VendingMachine {
    private State noCoinState;
    private State hasCoinState;
    private State dispensingState;
    private State outOfStockState;

    private State currentState;
    private int productCount;

    public VendingMachine(int productCount) {
        noCoinState = new NoCoinState(this);
        hasCoinState = new HasCoinState(this);
        dispensingState = new DispensingState(this);
        outOfStockState = new OutOfStockState(this);

        this.productCount = productCount;
        currentState = productCount > 0 ? noCoinState : outOfStockState;
    }

    public void insertCoin() {
        currentState.insertCoin();
    }

    public void ejectCoin() {
        currentState.ejectCoin();
    }

    public void selectProduct() {
        currentState.selectProduct();
        if (currentState == dispensingState && productCount > 0) {
            dispense();
        }
    }

    public void dispense() {
        if (productCount > 0) {
            productCount--;
            currentState.dispense();
        }
        if (productCount == 0) {
            currentState = outOfStockState;
        }
    }

    // Métodos para cambiar y obtener estados
    public void setState(State state) {
        this.currentState = state;
    }

    public State getNoCoinState() {
        return noCoinState;
    }

    public State getHasCoinState() {
        return hasCoinState;
    }

    public State getDispensingState() {
        return dispensingState;
    }

    public State getOutOfStockState() {
        return outOfStockState;
    }
}
