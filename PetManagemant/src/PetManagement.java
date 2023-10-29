import java.util.ArrayList;
import java.util.List;

class PetManagementSystem {
    private List<Pet> pets;

    public PetManagementSystem() {
        pets = new ArrayList<>();
    }

    public void addPet(Pet pet) {
        pets.add(pet);
    }

    public void removePet(Pet pet) {
        pets.remove(pet);
    }

    public void displayPets() {
        for (Pet pet : pets) {
            System.out.println(pet);
        }
    }
}
public class PetManagement {
    public static void main(String[] args) {
        PetManagementSystem petManagementSystem = new PetManagementSystem();

        Pet dog = new Dog("Buddy", 3, "white");
        System.out.println("\n");

        Pet cat = new Cat("Whiskers", 5, "gray");
        System.out.println("\n");

        Pet dog1 = new Dog("Ricky", 2, "dark brown");

        petManagementSystem.addPet(dog);
        petManagementSystem.addPet(dog);
        petManagementSystem.addPet(cat);

        petManagementSystem.removePet(dog1);

        petManagementSystem.displayPets();
    }
}
