import java.util.ArrayList;
import java.util.List;

// Composite class representing a housing unit composed of rooms
class Apartment implements Housing {
    private List<Housing> rooms;
    private String unitNumber;
    private String ApartmentAddress;

    public Apartment(String unitNumber, String ApartmentAddress) {
        this.unitNumber = unitNumber;
        this.ApartmentAddress = ApartmentAddress;
        rooms = new ArrayList<>();
    }

    public void addRoom(Housing room) {
        rooms.add(room);
    }

    @Override
    public void Show_Details_Of_Housing() {
        System.out.println("Apartment unit : " + unitNumber);
        System.out.println("Apartment Address : " + ApartmentAddress);
        for (Housing room : rooms) {
            room.Show_Details_Of_Housing();
        }
    }
}
