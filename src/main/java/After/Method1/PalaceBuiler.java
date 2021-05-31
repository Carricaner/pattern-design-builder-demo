package After.Method1;

class PalaceBuilder implements HouseBuilder {
    private Palace _palace;
    private String name;
    private Integer price;
    private Integer rooms;
    private String location;
    private String description;

    @Override
    public void reset() {
        _palace = new Palace();
    };

    @Override
    public void setName(String name) {
        _palace.setName(name);
    }

    @Override
    public void setPrice(Integer price) {
        _palace.setPrice(price);
    }

    @Override
    public void setRooms(Integer rooms) {
        _palace.setRooms(rooms);
    }

    @Override
    public void setLocation(String location) {
        _palace.setLocation(location);
    }

    @Override
    public void setDescription(String description) {
        _palace.setDescription(description);
    }

    public Palace build() {
        return _palace;
    }
}
