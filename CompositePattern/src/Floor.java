import java.util.ArrayList;
import java.util.List;

// Composite class representing a floor composed of housing units
class Floor implements Housing {
    private List<Housing> units;

    public Floor() {
        units = new ArrayList<>();
    }

    public void addUnit(Housing unit) {
        units.add(unit);
    }

    @Override
    public void Show_Details_Of_Housing() {
        System.out.println("Floor :");
        for (Housing unit : units) {
            unit.Show_Details_Of_Housing();
        }
    }
}