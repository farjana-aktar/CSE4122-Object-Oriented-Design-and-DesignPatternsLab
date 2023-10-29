public class Pet {
    private String name;
    private int age;
    private String color;

    public Pet(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return "Generic Pet";
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", color: " + color + ", Type: " + getType();
    }
}
