package aps;

import java.util.List;
import java.util.ArrayList;

public class BoxComposite implements IComponent {
    private List<IComponent> children;
    private double price;

    public BoxComposite() {
        this.children = new ArrayList<>();
        this.price = 0.5;

        /*
         * each box has an added packaging charge of $0.5
         */
    }
    
    public void addProduct(IComponent product) {
        children.add(product);
    }
    
    public void removeProduct(IComponent product) {
        children.remove(product);
    }    

    @Override
    public double getPrice() {
        for (IComponent child : children) {
            this.price += child.getPrice();

            /*
             * the box updates its own price with the summ
             * of its components
             */
        }

        return price;
    }
}
