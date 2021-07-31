package factoryMode.Product;

import factoryMode.Product.Adventurer;

public class Archer implements Adventurer {
    @Override
    public String getType() {
        System.out.println("Archer here!!");
        return this.getClass().getSimpleName();
    }
}
