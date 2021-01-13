import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        program(new Scanner(System.in), new Zoo("src/animals.json"));
    }
    public static void program(Scanner scan, Zoo zoo) {
        String in = "";
        Zoo.printZooMenu();
        while (!in.equals("exit")) {
            in = scan.nextLine();
            if (in.length() < 1) {
                continue;
            }
            switch (in) {
                case "all":
                    AnimalPrinter.printAll(zoo.getAnimals());
                    break;
                case "exit":
                    continue;
                case "menu":
                    Zoo.printZooMenu();
                    break;
                case "list":
                    AnimalPrinter.printAnimalList(zoo.getAnimals());
                    break;
                default:
                    AnimalPrinter.print(zoo.getAnimal(in));
                    break;
            }
        }
    }
}
