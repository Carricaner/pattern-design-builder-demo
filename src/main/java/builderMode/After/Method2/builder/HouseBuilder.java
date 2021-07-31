package builderMode.After.Method2.builder;

public interface HouseBuilder {
    HouseBuilder reset();
    HouseBuilder setName(String name);
    HouseBuilder setPrice(Integer price);
    HouseBuilder setRooms(Integer rooms);
    HouseBuilder setLocation(String location);
    HouseBuilder setDescription(String description);
    HouseBuilder setSpecial();
}
