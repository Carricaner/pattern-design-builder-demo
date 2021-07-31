package factoryMode.Factory;

import factoryMode.Product.Adventurer;
import factoryMode.Product.Archer;

public class ArcherTrainingCamp implements TrainingCamp {
    @Override
    public Adventurer trainAdventurer() {
        System.out.println("Trained a archer");
        return new Archer();
    }
}
