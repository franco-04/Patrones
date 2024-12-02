package Strategy1;

// Sin descuento
public class NoDiscountStrategy implements DiscountStrategy {
    @Override
    public double applyDiscount(double price) {
        System.out.println("Sin descuento aplicado.");
        return price;
    }
}
