package factory;

import factory.Factory.ArcherTrainingCamp;
import factory.Factory.TrainingCamp;
import factory.Factory.WarriorTrainingCamp;
import factory.Product.Adventurer;

public class AdventurerClient {
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
