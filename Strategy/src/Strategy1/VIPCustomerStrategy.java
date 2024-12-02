package Strategy1;

// Descuento para clientes VIP
public class VIPCustomerStrategy implements DiscountStrategy {
    @Override
    public double applyDiscount(double price) {
        System.out.println("Aplicando descuento para cliente VIP: 20%");
        return price * 0.80;
    }
}
