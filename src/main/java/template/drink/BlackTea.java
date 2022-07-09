package template.drink;

public class BlackTea extends Tea {

    private String name = "Black Tea";
    private final String prefix = "[" + name + "]";

    @Override
    public void brew() {
        System.out.println(prefix + " brewing...");
    }

    @Override
    public void prepare() {
        System.out.println(prefix + " Dried black tea leaves prepared.");
    }

    @Override
    public void serve() {
        prepare();
        brew();
        System.out.println(prefix + " " + name + " served.");
    }
}
