import java.util.ArrayList;
import java.util.List;

// Composite class representing a housing unit composed of rooms
class House implements Housing {
    private List<Housing> rooms;
    private String houseNumber;
    private String houseAddress;

    public House(String houseNumber, String houseAddress) {
        this.houseNumber = houseNumber;
        this.houseAddress = houseAddress;
        rooms = new ArrayList<>();
    }

    public void addRoom(Housing room) {
        rooms.add(room);
    }

    @Override
    public void Show_Details_Of_Housing() {
        System.out.println("House number : " + houseNumber);
        System.out.println("House Address : " + houseAddress);
        for (Housing room : rooms) {
            room.Show_Details_Of_Housing();
        }
    }
}