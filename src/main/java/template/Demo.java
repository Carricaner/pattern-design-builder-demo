package template;

public class Demo {
    public static void main(String[] args) throws Exception {
        DrinkMaker drinkMaker = new DrinkMaker();
        drinkMaker.serve(new OrderDetail("美式"));
        drinkMaker.serve(new OrderDetail("Black tea"));
        drinkMaker.serve(new OrderDetail("烏龍"));
    }
}
