package factoryMode.Factory;

import abstractFactoryMode.Factory.ArcherEquipFactory;
import abstractFactoryMode.Factory.EquipFactory;
import factoryMode.Product.Adventurer;
import factoryMode.Product.Archer;

public class ArcherTrainingCamp implements TrainingCamp {
    private static final EquipFactory factory = new ArcherEquipFactory();

    @Override
    public Adventurer trainAdventurer() {
        System.out.println("Trained a archer");
        Archer archer = new Archer();
        archer.setWeapon(factory.produceWeapon());
        archer.setClothes(factory.produceClothes());
        return archer;
    }
}
