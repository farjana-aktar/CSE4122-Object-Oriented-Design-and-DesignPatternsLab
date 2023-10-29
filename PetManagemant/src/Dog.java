class Dog extends Pet {
    public Dog(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public String getType() {
        return "Dog";
    }
}
