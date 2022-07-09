package template.drink;

public abstract class Tea implements Drink {

    private String name = "Default Tea";
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
