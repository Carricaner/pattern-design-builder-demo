package builderMode.After.Method1.product;

public class Palace extends House {

    public Palace() {}
    private Integer sportCars = 6;
    private Integer horses = 10;

    public void showDetails() {
        System.out.println("The Palace name: " + this.getName());
        System.out.println("Price:  NT$ " + this.getPrice());
        System.out.println("Rooms: " + this.getRooms());
        System.out.println("Location: " + this.getLocation());
        System.out.println("Sportcars: " + this.getSportCars());
        System.out.println("Horses: " + this.getHorses());
        System.out.println("Description: " + this.getDescription() + "\n");
    }

    public Integer getSportCars() {
        return sportCars;
    }

    public Integer getHorses() {
        return horses;
    }
}
