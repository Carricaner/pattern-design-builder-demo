package factoryMode.Product;

public class Archer extends Adventurer {
    @Override
    public String getType() {
        System.out.println("Archer here!!");
        return this.getClass().getSimpleName();
    }
}
