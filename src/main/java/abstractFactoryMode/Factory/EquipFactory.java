package abstractFactoryMode.Factory;

import abstractFactoryMode.Product.Clothes;
import abstractFactoryMode.Product.Weapon;

public interface EquipFactory {
    Weapon produceWeapon();
    Clothes produceClothes();

}
