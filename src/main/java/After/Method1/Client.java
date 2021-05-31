package After.Method1;

public class Client {
    public static void main(String[] args) {
        HouseDirector houseDirector = new HouseDirector();
        CastleBuilder castleBuilder = new CastleBuilder();
        houseDirector.buildCastle(castleBuilder);
        Castle castle = castleBuilder.build();
        castle.showDetails();

        PalaceBuilder palaceBuilder = new PalaceBuilder();
        houseDirector.buildPalace(palaceBuilder);
        Palace palace = palaceBuilder.build();
        palace.showDetails();
    }
}
