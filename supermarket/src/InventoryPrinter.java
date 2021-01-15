public class InventoryPrinter {
    public static void printWelcome() {
        System.out.println("Welcome to your market! you can manage your own inventory of products");
        System.out.println("you can add, sell and list products from your inventory.");
        System.out.println("Have fun!\n");
    }
    public static void printHelp() {
        System.out.println("Market usage:");
        System.out.println("There are three main commands:");
        System.out.println("\t add");
        System.out.println("\t sell");
        System.out.println("\t inv\n");
        System.out.println("|| add command ||");
        InventoryPrinter.addProductHint();
        System.out.println();
        System.out.println("|| sell command ||");
        InventoryPrinter.sellProductHint();
        System.out.println();
        System.out.println("|| inv command ||");
        System.out.println("Just type the word \"inv\" to list the available products in your inventory");
        System.out.println();
        System.out.println("Repeat this menu by typing the command \"help\"");
    }
    public static void printProduct(Product product) {
        System.out.println("name: " + product.getName());
        System.out.println("price: " + product.getPrice());
        System.out.println("amount: " + product.getAmount() + "\n");
    }
    public static void printInventory(Inventory inventory) {
        for(Product product: inventory.getProducts()) {
            InventoryPrinter.printProduct(product);
        }
    }
    public static void sizeErrorMessage(Integer size, Integer amount) {
        System.out.println("You can\'t sell " + size + " since you have " + amount + " of this product");
    }
    public static void productDoesNotExist() {
        System.out.println("Can\'t sell this product, it is not available");
    }
    public static void showPrices(Inventory inventory) {
        for (Product product: inventory.getProducts()) {
            System.out.println(product.getName() + " x" + product.getAmount());
        }
    }
    public static void invalidOperation() {
        System.out.println("Invalid operation");
    }
    public static void addProductHint() {
        System.out.println("Usage:");
        System.out.println("add <product name> <price> <amount>");
        System.out.println("i.e: add meat 20 1");
    }
    public static void sellProductHint() {
        System.out.println("Usage:");
        System.out.println("sell <product name> <amount>");
        System.out.println("i.e: sell meat 2");
    }
}
