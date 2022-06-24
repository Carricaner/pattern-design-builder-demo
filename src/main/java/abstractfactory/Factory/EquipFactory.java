package abstractfactory.Factory;

import abstractfactory.Product.Clothes;
import abstractfactory.Product.Weapon;

public interface EquipFactory {
    Weapon produceWeapon();
    Clothes produceClothes();

}
