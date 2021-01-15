import java.util.ArrayList;
import java.util.Scanner;

public class InputHandler {
    static Scanner scan = new Scanner(System.in);

    public static void inputChecker(Inventory inventory) {
        String in = scan.nextLine();
        String[] tokens = in.split(" ");
        ArrayList<String> params = getParameters(tokens);

        switch (tokens[0]) {
            case "add":
                try {
                    String name = params.get(0);
                    Float price = Float.parseFloat(params.get(1));
                    Integer amount = Integer.parseInt(params.get(2));
                    inventory.addProduct(name, price, amount);
                } catch (Exception err) {
                    InventoryPrinter.invalidOperation();
                    InventoryPrinter.addProductHint();
                }
                break;
            case "sell":
                try {
                    String name = params.get(0);
                    Integer amount = Integer.parseInt(params.get(1));
                    inventory.sellProduct(name, amount);
                } catch (Exception err) {
                    InventoryPrinter.invalidOperation();
                    InventoryPrinter.sellProductHint();
                }
                break;
            case "inv":
                InventoryPrinter.printInventory(inventory);
                break;
            case "help":
                InventoryPrinter.printHelp();
                break;
            case "exit":
                System.exit(0);
            default:
                InventoryPrinter.invalidOperation();
        }
    }
    public static ArrayList<String> getParameters(String[] tokens) {
        ArrayList<String> params = new ArrayList<>();
        for (int n = 1; n < tokens.length; n++) {
            params.add(tokens[n]);
        }
        return params;
    }
}
