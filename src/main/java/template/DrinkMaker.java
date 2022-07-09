package template;

import template.drink.Americano;
import template.drink.BlackTea;
import template.drink.Drink;
import template.drink.Latte;
import template.drink.OolongTea;

import java.util.Map;

public class DrinkMaker {
    private static final Drink latte = new Latte();
    private static final Drink americano = new Americano();

    private static final Drink blackTea = new BlackTea();
    private static final Drink oolongTea = new OolongTea();

    // Map.of will return an unmodified map.
    private static final Map<String, Drink> menu = Map.of(
            "latte", latte,
            "拿鐵", latte,
            "americano", americano,
            "美式", americano,
            "美式咖啡", americano,
            "紅茶", blackTea,
            "black tea", blackTea,
            "烏龍", oolongTea,
            "oolong tea", oolongTea
    );

    public void serve(OrderDetail orderDetail) throws Exception {
        Drink drink = determineDrink(orderDetail);
        drink.serve();
    };

    private Drink determineDrink(OrderDetail orderDetail) throws Exception {
        String name = orderDetail.name().trim().toLowerCase();
        if (menu.containsKey(name)) {
            return menu.get(name);
        } else {
            throw new Exception("We don't serve the order drink.");
        }
    }
}
