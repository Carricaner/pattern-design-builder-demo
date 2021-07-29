package builder.After.Method2;

import builder.After.Method2.builder.PalaceBuilder;
import builder.After.Method2.builder.CastleBuilder;
import builder.After.Method2.product.Castle;
import builder.After.Method2.product.Palace;

public class Client {
    public static void main(String[] args) {
        Castle castle = new CastleBuilder()
                .setName("中國風城堡")
                .setPrice(12300000)
                .setRooms(50)
                .setLocation("Taitung")
                .setDescription("入住中國風城堡")
                .setSpecial()
                .build();
        castle.showDetails();

        Palace palace = new PalaceBuilder()
                .setName("希臘風皇宮")
                .setPrice(45000000)
                .setRooms(10)
                .setLocation("Hsinchu")
                .setDescription("入住希臘風皇宮")
                .setSpecial()
                .build();
        palace.showDetails();

    }
}
