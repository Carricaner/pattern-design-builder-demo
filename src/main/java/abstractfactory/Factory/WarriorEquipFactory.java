package abstractfactory.Factory;

import abstractfactory.Product.Armor;
import abstractfactory.Product.Clothes;
import abstractfactory.Product.Sword;
import abstractfactory.Product.Weapon;

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
