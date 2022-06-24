package factory.Product;

public class Warrior extends Adventurer {
    @Override
    public String getType() {
        System.out.println("Warrior here!!");
        return this.getClass().getSimpleName();
    }
}
