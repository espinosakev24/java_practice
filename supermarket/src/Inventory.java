import java.util.ArrayList;

public class Inventory {
    private final ArrayList<Product> products = new ArrayList<>();

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void addProduct(String name, Float price, Integer amount) {
        ProductHandler.addProductToList(this.products, name, price, amount);
    }
    public void sellProduct(String name, Integer amount) {
        ProductHandler.removeProductFromList(this.products, name, amount);
    }
}
