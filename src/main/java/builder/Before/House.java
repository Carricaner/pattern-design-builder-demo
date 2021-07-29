package builder.Before;

public class House {
    // Constructor for building a simple house
    public House (Integer windows, Integer doors, Integer toilets, Float area, Integer floors) {
        this(windows, doors, toilets, area, floors, false, false, false, false, false);
    }
    // Constructor for building a house which client A needs
    public House (Integer windows, Integer doors, Integer toilets, Float area, Integer floors, Boolean hasSwimmingPool) {
        this(windows, doors, toilets, area, floors, hasSwimmingPool, false, false, false, false);
    }
    // Constructor for building a house which client B needs
    public House (Integer windows, Integer doors, Integer toilets, Float area, Integer floors, Boolean hasGarden, Boolean hasGarage) {
        this(windows, doors, toilets, area, floors, false, hasGarden, hasGarage, false, false);
    }
    // Constructor for building a house with all arguments
    public House (Integer windows, Integer doors, Integer toilets, Float area, Integer floors, Boolean hasSwimmingPool, Boolean hasGarden, Boolean hasGarage, Boolean hasGym, Boolean hasBullpen) {
        this.windows = windows;
        this.doors = doors;
        this.toilets = toilets;
        this.area = area;
        this.floors = floors;
        this.hasSwimmingPool = hasSwimmingPool;
        this.hasGarden = hasGarden;
        this.hasGarage = hasGarage;
        this.hasGym = hasGym;
        this.hasBullpen = hasBullpen;
    }

    private Integer windows;
    private Integer doors;
    private Integer toilets;
    private Float area;
    private Integer floors;
    private Boolean hasSwimmingPool;
    private Boolean hasGarden;
    private Boolean hasGarage;
    private Boolean hasGym;
    private Boolean hasBullpen;

    public Integer getWindows() {
        return windows;
    }

    public void setWindows(Integer windows) {
        this.windows = windows;
    }

    public Integer getDoors() {
        return doors;
    }

    public void setDoors(Integer doors) {
        this.doors = doors;
    }

    public Integer getToilets() {
        return toilets;
    }

    public void setToilets(Integer toilets) {
        this.toilets = toilets;
    }

    public Float getArea() {
        return area;
    }

    public void setArea(Float area) {
        this.area = area;
    }

    public Integer getFloors() {
        return floors;
    }

    public void setFloors(Integer floors) {
        this.floors = floors;
    }

    public Boolean getHasSwimmingPool() {
        return hasSwimmingPool;
    }

    public void setHasSwimmingPool(Boolean hasSwimmingPool) {
        this.hasSwimmingPool = hasSwimmingPool;
    }

    public Boolean getHasGarden() {
        return hasGarden;
    }

    public void setHasGarden(Boolean hasGarden) {
        this.hasGarden = hasGarden;
    }

    public Boolean getHasGarage() {
        return hasGarage;
    }

    public void setHasGarage(Boolean hasGarage) {
        this.hasGarage = hasGarage;
    }

    public Boolean getHasGym() {
        return hasGym;
    }

    public void setHasGym(Boolean hasGym) {
        this.hasGym = hasGym;
    }

    public Boolean getHasBullpen() {
        return hasBullpen;
    }

    public void setHasBullpen(Boolean hasBullpen) {
        this.hasBullpen = hasBullpen;
    }
}
