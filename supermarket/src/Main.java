public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        InvInitializer.initInventory(inventory);
        program(inventory);
    }
    public static void  program(Inventory inventory) {
        InventoryPrinter.printWelcome();
        InventoryPrinter.printHelp();
        while (true) {
            InputHandler.inputChecker(inventory);
        }
    }
}