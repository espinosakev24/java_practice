import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        program(new Scanner(System.in));
    }
    public static void program(Scanner scan) {
        String[] tokens = {""};

        System.out.println(
                "<--- Usage --->\n" +
                "add, substract, multiply, divide are the commands allowed\n" +
                "i.e: add 5 4 10 20\n"+
                "39.0"
        );
        while (!tokens[0].equals("exit")) {
            tokens = scan.nextLine().split(" ");
            operator(tokens);
        }
    }
    public static void operator(String[] tokens) {
        List<Float> parameters = getParameters(tokens);

        switch (tokens[0]) {
            case "add":
                System.out.println(Calculator.add(parameters));
                break;
            case "substract":
                System.out.println(Calculator.substract(parameters));
                break;
            case "multiply":
                System.out.println(Calculator.multiply(parameters));
                break;
            case "divide":
                System.out.println(Calculator.divide(parameters));
                break;
        }
    }
    public static List<Float> getParameters(String[] tokens) {
        List<Float> params = new ArrayList<>();
        for (int n = 1; n < tokens.length; n++) {
            params.add(Float.parseFloat(tokens[n]));
        }
        return params;
    }
}

/*System.out.println(Calculator.add(new ArrayList<Integer>(Arrays.asList(1,2,3))));*/