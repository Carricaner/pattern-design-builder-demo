package factory.Factory;

import abstractfactory.Factory.EquipFactory;
import abstractfactory.Factory.WarriorEquipFactory;
import factory.Product.Adventurer;
import factory.Product.Warrior;

public class WarriorTrainingCamp implements TrainingCamp {
    private static final EquipFactory factory = new WarriorEquipFactory();

    @Override
    public Adventurer trainAdventurer() {
        System.out.println("Trained a warrior");
        Adventurer warrior = new Warrior();
        warrior.setWeapon(factory.produceWeapon());
        warrior.setClothes(factory.produceClothes());
        return warrior;
    }
}
