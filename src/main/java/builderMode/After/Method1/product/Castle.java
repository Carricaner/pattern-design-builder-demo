package builderMode.After.Method1.product;

public class Castle extends House {
    private Integer guardians = 10;
    private Integer servants = 5;

    public Castle() {

    }

    public void showDetails() {
        System.out.println("The Castle name: " + this.getName());
        System.out.println("Price:  NT$ " + this.getPrice());
        System.out.println("Rooms: " + this.getRooms());
        System.out.println("Location: " + this.getLocation());
        System.out.println("Guardian: " + this.getGuardians());
        System.out.println("Servants: " + this.getServants());
        System.out.println("Description: " + this.getDescription() + "\n");
    }

    public Integer getGuardians() {
        return guardians;
    }

    public Integer getServants() {
        return servants;
    }
}
