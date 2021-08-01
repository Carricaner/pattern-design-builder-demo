package abstractFactoryMode.Factory;

import abstractFactoryMode.Product.Armor;
import abstractFactoryMode.Product.Clothes;
import abstractFactoryMode.Product.Sword;
import abstractFactoryMode.Product.Weapon;

public class WarriorEquipFactory implements EquipFactory {
    @Override
    public Weapon produceWeapon() {
        Sword product = new Sword();
        product.setAtk(10);
        product.setRange(1);
        return product;
    }

    @Override
    public Clothes produceClothes() {
        Armor product = new Armor();
        product.setDef(10);
        return product;
    }
}
