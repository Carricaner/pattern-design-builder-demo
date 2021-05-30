package After.Method1;

public class Client {
    public static void main(String[] args) {
        HouseDirector houseDirector = new HouseDirector();
        CastleBuilder castleBuilder = new CastleBuilder();
        houseDirector.buildCastle(castleBuilder);
        Castle castle = castleBuilder.build();
        System.out.println(castle.getArea());
    }
}
