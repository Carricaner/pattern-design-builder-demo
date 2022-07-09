package template.drink;

public class OolongTea extends Tea {

    private String name = "Oolong Tea";
    private final String prefix = "[" + name + "]";

    @Override
    public void brew() {
        System.out.println(prefix + " brewing...");
    }

    @Override
    public void prepare() {
        System.out.println(prefix + " Dried oolong tea leaves prepared.");
    }

    @Override
    public void serve() {
        prepare();
        brew();
        System.out.println(prefix + " " + name + " served.");
    }
}
