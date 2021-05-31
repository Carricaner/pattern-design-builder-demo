package After.Method1;

public class Client {
    public static void main(String[] args) {
        // new 一個工頭名為 Tom
        HouseDirector TomTheDirector = new HouseDirector();

        // new 一個工人名為 Kevin (這時候 Kevin 只是一個工人，還不知道他要做什麼)
        CastleBuilder KevinTheBuilder = new CastleBuilder();
        // Tom 叫 Kevin 建造一間城堡，並跟他說所有需要的參數 ( Kevin 這時候變成「城堡建築工」)
        TomTheDirector.buildCastle(KevinTheBuilder);
        // Kevin 建造城堡
        Castle castle = KevinTheBuilder.build();
        castle.showDetails();

        // new 一個工人名為 Jack (這時候 Jack 只是一個工人，還不知道他要做什麼)
        PalaceBuilder palaceBuilder = new PalaceBuilder();
        // Tom 叫 Jack 建造一間皇宮，並跟他說所有需要的參數 ( Jack 這時候變成「皇宮建築工」)
        TomTheDirector.buildPalace(palaceBuilder);
        // Jack 建造皇宮
        Palace palace = palaceBuilder.build();
        palace.showDetails();
    }
}
