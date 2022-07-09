package template.drink;

public class Americano extends Coffee {

    // properties
    private final String name = "Americano";
    private final String prefix = "[" + name + "]";

    @Override
    public void brew() {
        System.out.println(prefix + " brewing...");
    }

    @Override
    public void serve() {
        brew();
        System.out.println(prefix + " " + name + " served.");
    }
}
