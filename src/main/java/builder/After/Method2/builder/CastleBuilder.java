package builder.After.Method2.builder;

import builder.After.Method2.product.Castle;

public class CastleBuilder implements HouseBuilder {
    private Castle _castle;
    private Integer guardians = 10;
    private Integer servants = 5;

    public CastleBuilder () {
        _castle = new Castle();
    }

    @Override
    public CastleBuilder reset() {
        _castle = new Castle();
        return this;
    };

    @Override
    public CastleBuilder setName(String name) {
        _castle.setName(name);
        return this;
    }

    @Override
    public CastleBuilder setPrice(Integer price) {
        _castle.setPrice(price);
        return this;
    }

    @Override
    public CastleBuilder setRooms(Integer rooms) {
        _castle.setRooms(rooms);
        return this;
    }

    @Override
    public CastleBuilder setLocation(String location) {
        _castle.setLocation(location);
        return this;
    }

    @Override
    public CastleBuilder setDescription(String description) {
        _castle.setDescription(description);
        return this;
    }

    @Override
    public CastleBuilder setSpecial() {
        _castle.setGuardians(guardians);
        _castle.setServants(servants);
        return this;
    }

    public Castle build() {
        return _castle;
    }
}
