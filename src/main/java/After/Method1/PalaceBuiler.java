package After.Method1;

class PalaceBuilder implements HouseBuilder {
    private Palace _palace;
    private Integer windows;
    private Integer doors;
    private Integer toilets;
    private Float area;
    private Integer floors;
    private Boolean onSale;

    public void reset() {
        _palace = new Palace();
    }

    @Override
    public void setWindows(Integer windows) {
        _palace.setWindows(windows);
    }

    @Override
    public void setDoors(Integer doors) {
        _palace.setDoors(doors);
    }

    @Override
    public void setToilets(Integer toilets) {
        _palace.setToilets(toilets);
    }

    @Override
    public void setArea(Float area) {
        _palace.setArea(area);
    }

    @Override
    public void setFloors(Integer floors) {
        _palace.setFloors(floors);
    }

    @Override
    public void setOnSale(Boolean onSale) {
        _palace.setOnSale(onSale);
    }

    public Palace build() {
        return _palace;
    }
}
