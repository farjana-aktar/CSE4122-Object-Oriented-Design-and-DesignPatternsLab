import java.util.ArrayList;
import java.util.List;

// Composite class representing a building composed of floors
class Building implements Housing {
    private List<Housing> floors;

    public Building() {
        floors = new ArrayList<>();
    }

    public void addFloor(Floor floor) {
        floors.add(floor);
    }

    @Override
    public void Show_Details_Of_Housing() {
        System.out.println("Building:");
        for (Housing floor : floors) {
            floor.Show_Details_Of_Housing();
        }
    }
}