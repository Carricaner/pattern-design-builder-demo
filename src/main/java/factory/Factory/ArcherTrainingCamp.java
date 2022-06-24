package factory.Factory;

import abstractfactory.Factory.ArcherEquipFactory;
import abstractfactory.Factory.EquipFactory;
import factory.Product.Adventurer;
import factory.Product.Archer;

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
