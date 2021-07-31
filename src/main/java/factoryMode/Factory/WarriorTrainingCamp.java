package factoryMode.Factory;

import factoryMode.Product.Adventurer;
import factoryMode.Product.Warrior;

public class WarriorTrainingCamp implements TrainingCamp {
    @Override
    public Adventurer trainAdventurer() {
        System.out.println("Trained a warrior");
        return new Warrior();
    }
}
