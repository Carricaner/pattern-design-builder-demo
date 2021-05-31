package After.Method1.builder;

import After.Method1.product.Palace;

public class PalaceBuilder implements HouseBuilder {
    private Palace _palace;

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
