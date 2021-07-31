package builderMode.After.Method1.builder;

import builderMode.After.Method1.product.Castle;

public class CastleBuilder implements HouseBuilder {
    private Castle _castle;

    @Override
    public void reset() {
        _castle = new Castle();
    };

    @Override
    public void setName(String name) {
        _castle.setName(name);
    }

    @Override
    public void setPrice(Integer price) {
        _castle.setPrice(price);
    }

    @Override
    public void setRooms(Integer rooms) {
        _castle.setRooms(rooms);
    }

    @Override
    public void setLocation(String location) {
        _castle.setLocation(location);
    }

    @Override
    public void setDescription(String description) {
        _castle.setDescription(description);
    }

    public Castle build() {
        return _castle;
    }
}
