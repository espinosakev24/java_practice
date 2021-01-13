import java.util.ArrayList;
import java.util.List;

public class Calculator {
    public static float add(List<Float> args) {
        float result = 0;

        for (Float n : args) {
            result = result + n;
        }
        return result;
    }
    public static float substract(List<Float> args) {
        float result = args.get(0);

        for (int n = 1; n < args.size(); n++) {
            result = result - args.get(n);
        }
        return result;
    }
    public static float multiply(List<Float> args) {
        float result = 1;

        for (Float n : args) {
            result = result * n;
        }
        return result;
    }
    public static float divide(List<Float> args) {
        float result = args.get(0);

        for (int n = 1; n < args.size(); n++) {
            result = result / args.get(n);
        }
        return result;
    }
}
