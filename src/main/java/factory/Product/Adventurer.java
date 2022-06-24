package factory.Product;

import abstractfactory.Product.Clothes;
import abstractfactory.Product.Weapon;

public abstract class Adventurer {
    protected Weapon weapon;
    Clothes clothes = null;

    public abstract String getType();

    public void display() {
        System.out.println("I am a " + this.getClass().getSimpleName());
        weapon.display();
        clothes.display();
    };

    public Weapon getWeapon() {
        return weapon;
    }
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Clothes getClothes() {
        return clothes;
    }
    public void setClothes(Clothes clothes) {
        this.clothes = clothes;
    }
}
