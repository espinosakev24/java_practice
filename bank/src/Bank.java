import java.lang.reflect.Array;
import java.util.Scanner;
import figures.Square;
import figures.Triangle;
public class Bank {
    public static final String ADD = "add";
    public static final String GET = "get";
    public static void main(String[] args) {
        String[] words = {};
        Account account = new Account();
        String in = "";
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the bank, you can perform 2 basic operations");
        System.out.println("\"add\" and \"get\" to add money to the bank or get money from the bank");
        System.out.println("Both operations receive a number indicating the amount of money");
        System.out.println("For example:");
        System.out.println("add 500");
        System.out.println("or");
        System.out.println("get 400");
        while (!in.equals("exit")) {
            in = scan.nextLine();
            words = in.split(" ");
            if (words.length <= 1) {
                continue;
            }
            switch (words[0]) {
                case Bank.ADD:
                    account.add(Integer.parseInt(words[1]));
                    break;
                case Bank.GET:
                    account.retrieve(Integer.parseInt(words[1]));
                    break;
                default:
                    System.out.println("Invalid command");
                    break;
            }
            System.out.println("Your balance is " + account.getBalance());
        }
    }
}
 