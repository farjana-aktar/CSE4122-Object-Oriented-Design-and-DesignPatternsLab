class Room implements Housing {
    private String roomName;

    public Room(String roomName) {
        this.roomName = roomName;
    }

    @Override
    public void Show_Details_Of_Housing() {
        System.out.println("Room : " + roomName);
    }
}