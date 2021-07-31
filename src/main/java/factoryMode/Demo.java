package factoryMode;

import factoryMode.Product.Adventurer;

public class Demo {
    public static void main(String[] args) {
        Adventurer archer = Application.createAdventure("archer");
        System.out.println("type: " + archer.getType());

        Adventurer warrior = Application.createAdventure("warrior");
        System.out.println("type: " + warrior.getType());
    }
}
