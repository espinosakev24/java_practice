public class Product {
    private String name;
    private Float price;
    private Integer amount;

    public Product(String name, Float price, Integer amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }
    public String getName() {
        return name;
    }

    public Float getPrice() {
        return price;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
