import java.util.ArrayList;

public class AnimalPrinter {
    public static void print(Animal animal) {
        if (animal.getName().length() < 1) {
            System.out.println("Sorry, this animal is not here :/");
        } else {
            System.out.println(
                    "name: " + animal.getName() + "\n" +
                    "specie: " + animal.getSpecie() + "\n" +
                    "description: " + animal.getDescription() + "\n"
            );
        }
    }
    public static void printAll(ArrayList<Animal> animals) {
        for (Animal animal: animals) {
            AnimalPrinter.print(animal);
        }
    }
    public static void printAnimalList(ArrayList<Animal> animals) {
        for (Animal animal: animals) {
            System.out.println(animal.getName());
        }
    }
}
