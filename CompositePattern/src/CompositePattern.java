class CompositePattern {
    public static void main(String[] args) {
        Room livingRoom1 = new Room("Living Room");
        Room bedroom1 = new Room("Bedroom");
        Room kitchen1 = new Room("Kitchen");

        Apartment apartment1 = new Apartment("101", "12/17 Kajla, Rajshahi");
        apartment1.addRoom(livingRoom1);
        apartment1.addRoom(bedroom1);
        apartment1.addRoom(kitchen1);

        Room livingRoom2 = new Room("Living Room");
        Room bedroom2 = new Room("Bedroom");
        Room kitchen2 = new Room("Kitchen");

        House house1 = new House("A1", "20/18 Rajshahi");
        house1.addRoom(livingRoom2);
        house1.addRoom(bedroom2);
        house1.addRoom(kitchen2);

        Floor floor1 = new Floor();
        floor1.addUnit(apartment1);

        Floor floor2 = new Floor();
        floor2.addUnit(house1);

        Building building = new Building();
        building.addFloor(floor1);
        building.addFloor(floor2);

        building.Show_Details_Of_Housing();
    }
}
