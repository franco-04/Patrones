package Strategy1;

// Descuento para clientes normales
public class RegularCustomerStrategy implements DiscountStrategy {
    @Override
    public double applyDiscount(double price) {
        System.out.println("Aplicando descuento para cliente regular: 10%");
        return price * 0.90;
    }
}
