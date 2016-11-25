/**
 * Created by tania on 11/21/16.
 */
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input function: ");
        String function = sc.next();

        System.out.println("Input first value: ");
        double value1 = sc.nextDouble();

        System.out.println("Input second value: ");
        double value2 = sc.nextDouble();

        sc.close();
        System.out.println("Result: " + Calc(value1, value2, function));

    }

    public static double Calc(double value1, double value2, String function) {
        double result = 0;
        if (function.equals("+")) {
            result = value1 + value2;
        }
        if (function.equals("-")) {
            result = value1 - value2;
        }
        if (function.equals("*")) {
            result = value1 * value2;
        }
        if (function.equals("/")) {
            result = value1 / value2;
        }
        return result;
    }
}




