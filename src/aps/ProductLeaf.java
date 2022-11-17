package aps;

public class ProductLeaf implements IComponent {
    private double price;

    public ProductLeaf (double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }    
}
