package abstractfactory.Factory;

import abstractfactory.Product.Bow;
import abstractfactory.Product.Clothes;
import abstractfactory.Product.Leather;
import abstractfactory.Product.Weapon;

public class ArcherEquipFactory implements EquipFactory {
    @Override
    public Weapon produceWeapon() {
        Bow product = new Bow();
        product.setAtk(10);
        product.setRange(10);
        return product;
    }

    @Override
    public Clothes produceClothes() {
        Leather product = new Leather();
        product.setDef(5);
        return product;
    }
}
