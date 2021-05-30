package After.Method1;

import java.util.Locale;

public class HouseDirector {

    public void buildCastle(HouseBuilder houseBuilder) {
        houseBuilder.reset();
        houseBuilder.setWindows(100);
        houseBuilder.setDoors(60);
        houseBuilder.setToilets(10);
        houseBuilder.setArea(100.25F);
        houseBuilder.setFloors(8);
        houseBuilder.setOnSale(true);
    }

    public void buildPalace(HouseBuilder houseBuilder) {
        houseBuilder.reset();
        houseBuilder.setWindows(80);
        houseBuilder.setDoors(50);
        houseBuilder.setToilets(15);
        houseBuilder.setArea(80.75F);
        houseBuilder.setFloors(5);
        houseBuilder.setOnSale(true);
    }
}
