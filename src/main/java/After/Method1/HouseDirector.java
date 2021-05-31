package After.Method1;

public class HouseDirector {

    public void buildCastle(HouseBuilder houseBuilder) {
        houseBuilder.reset();
        houseBuilder.setName("中古世紀風格城堡");
        houseBuilder.setPrice(100000000);
        houseBuilder.setRooms(20);
        houseBuilder.setLocation("Taipei");
        houseBuilder.setDescription("入住中古世紀風格城堡");
    }

    public void buildPalace(HouseBuilder houseBuilder) {
        houseBuilder.reset();
        houseBuilder.setName("印度風皇宮");
        houseBuilder.setPrice(200000000);
        houseBuilder.setRooms(15);
        houseBuilder.setLocation("Tainan");
        houseBuilder.setDescription("入住印度風皇宮");
    }
}
