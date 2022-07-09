package template.drink;

public abstract class Coffee implements Drink {

    private String name = "Default Coffee";
    private final String prefix = "[" + name + "]";

    @Override
    public void brew() {
        System.out.println(prefix + " brewing...");
    }

    @Override
    public void prepare() {
        System.out.println(prefix + " brewing...");
    }

    @Override
    public void serve() {
        prepare();
        brew();
        System.out.println(prefix + " served.");
    }
}
