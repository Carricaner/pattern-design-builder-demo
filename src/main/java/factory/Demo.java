package factory;

import factory.Product.Adventurer;

public class Demo {
    public static void main(String[] args) {
        Adventurer archer = AdventurerClient.createAdventure("archer");
        archer.display();
        System.out.println("type: " + archer.getType());

        Adventurer warrior = AdventurerClient.createAdventure("warrior");
        warrior.display();
        System.out.println("type: " + warrior.getType());
    }
}
