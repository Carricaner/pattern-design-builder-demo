package After.Method2;

class PalaceBuilder implements HouseBuilder {
    private Palace _palace;
    private Integer sportCars = 6;
    private Integer horses = 10;

    public PalaceBuilder() {
        _palace = new Palace();
    }

    @Override
    public PalaceBuilder reset() {
        _palace = new Palace();
        return this;
    };

    @Override
    public PalaceBuilder setName(String name) {
        _palace.setName(name);
        return this;
    }

    @Override
    public PalaceBuilder setPrice(Integer price) {
        _palace.setPrice(price);
        return this;
    }

    @Override
    public PalaceBuilder setRooms(Integer rooms) {
        _palace.setRooms(rooms);
        return this;
    }

    @Override
    public PalaceBuilder setLocation(String location) {
        _palace.setLocation(location);
        return this;
    }

    @Override
    public PalaceBuilder setDescription(String description) {
        _palace.setDescription(description);
        return this;
    }

    @Override
    public PalaceBuilder setSpecial() {
        _palace.setSportCars(sportCars);
        _palace.setHorses(horses);
        return this;
    }

    public Palace build() {
        return _palace;
    }
}
