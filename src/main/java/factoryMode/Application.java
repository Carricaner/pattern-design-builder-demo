package factoryMode;

import factoryMode.Factory.ArcherTrainingCamp;
import factoryMode.Factory.TrainingCamp;
import factoryMode.Factory.WarriorTrainingCamp;
import factoryMode.Product.Adventurer;

public class Application {
    private static TrainingCamp trainingCamp;
    private static Adventurer adventurer;

    public static Adventurer createAdventure(String role) {
        switch (role) {
            case "archer":
                trainingCamp = new ArcherTrainingCamp();
                break;
            case "warrior":
                trainingCamp = new WarriorTrainingCamp();
                break;
        }
        adventurer = trainingCamp.trainAdventurer();
        return adventurer;
    }

}
