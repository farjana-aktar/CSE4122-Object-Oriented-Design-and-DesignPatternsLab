class Cat extends Pet {
    public Cat(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public String getType() {
        return "Cat";
    }
}
