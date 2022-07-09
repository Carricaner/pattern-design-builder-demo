package template.drink;

public class Latte extends Coffee {

    private final String name = "Latte Coffee";
    private final String prefix = "[" + name + "]";

    @Override
    public void brew() {
        System.out.println(prefix + " brewing...");
    }

    @Override
    public void prepare() {
        System.out.println(prefix + " Milk prepared.");
        System.out.println(prefix + " Steamer prepared.");
    }

    @Override
    public void serve() {
        prepare();
        brew();
        System.out.println(prefix + " " + name + " served.");
    }
}
