import java.util.ArrayList;

public class ProductHandler {
    public static void setProductAmount(Product product, Integer amount) {
        Integer newAmount = product.getAmount() + amount;
        product.setAmount(newAmount);
    }
    public static void addProductToList(ArrayList<Product> products, String name, Float price, Integer amount) {
        boolean productExists = false;
        for (Product product: products) {
            if(name.equals(product.getName())) {
                productExists = true;
                ProductHandler.setProductAmount(product, amount);
            }
        }
        if (!productExists) {
            products.add(new Product(name, price, amount));
        }
    }

    public static void removeProductFromList(ArrayList<Product> products, String name, Integer amount) {
        for (int n = 0; n < products.size(); n++) {
            if (products.get(n).getName().equals(name)) {
                if (amount > products.get(n).getAmount()) {
                    InventoryPrinter.sizeErrorMessage(amount, products.get(n).getAmount());
                }
                else if (products.get(n).getAmount().equals(amount)) {
                    products.remove(n);
                } else {
                    ProductHandler.setProductAmount(products.get(n), amount * -1);
                }
                return;
            }
        }
        InventoryPrinter.productDoesNotExist();
    }
}