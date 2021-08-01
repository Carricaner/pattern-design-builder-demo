package abstractFactoryMode.Factory;

import abstractFactoryMode.Product.Bow;
import abstractFactoryMode.Product.Clothes;
import abstractFactoryMode.Product.Leather;
import abstractFactoryMode.Product.Weapon;

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
