package factoryMode.Product;

import factoryMode.Product.Adventurer;

public class Warrior implements Adventurer {
    @Override
    public String getType() {
        System.out.println("Warrior here!!");
        return this.getClass().getSimpleName();
    }
}
