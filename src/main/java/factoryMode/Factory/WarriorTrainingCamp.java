package factoryMode.Factory;

import abstractFactoryMode.Factory.EquipFactory;
import abstractFactoryMode.Factory.WarriorEquipFactory;
import factoryMode.Product.Adventurer;
import factoryMode.Product.Warrior;

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
