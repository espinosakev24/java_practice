public class Account {
    private int balance = 0;
    public int getBalance() {
        return balance;
    }
    public void retrieve(int amount) {
        if (balance - amount < 0) {
            System.out.println("Yo don't have enough money in your account to do this operation");
            return;
        }
        balance = balance - amount;
    }
    public void add(int amount) {
        balance = balance + amount;
    }
    public void printBalance() {
        System.out.println(balance);
    }
}
