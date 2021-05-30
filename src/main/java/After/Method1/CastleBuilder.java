package After.Method1;

class CastleBuilder implements HouseBuilder {
    private Castle _castle;
    private Integer windows;
    private Integer doors;
    private Integer toilets;
    private Float area;
    private Integer floors;
    private Boolean onSale;

    public void reset() {
        _castle = new Castle();
    }

    @Override
    public void setWindows(Integer windows) {
        _castle.setWindows(windows);
    }

    @Override
    public void setDoors(Integer doors) {
        _castle.setDoors(doors);
    }

    @Override
    public void setToilets(Integer toilets) {
        _castle.setToilets(toilets);
    }

    @Override
    public void setArea(Float area) {
        _castle.setArea(area);
    }

    @Override
    public void setFloors(Integer floors) {
        _castle.setFloors(floors);
    }

    @Override
    public void setOnSale(Boolean onSale) {
        _castle.setOnSale(onSale);
    }

    public Castle build() {
        return _castle;
    }
}
