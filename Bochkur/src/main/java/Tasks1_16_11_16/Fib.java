package Tasks1_16_11_16;

import java.util.Scanner;

public class Fib {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter num");
        int num = in.nextInt();
        System.out.println(fib(num));
    }
    public static int fib(int n) {
        switch (n) {
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                return fib(n - 1) + fib(n - 2);
        }
    }
}

