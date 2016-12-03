package hillel.task1;

import java.util.Scanner;

public class Fib {

    public static void main(String args[]) {
        System.out.println("Enter index of Fibonacci number to print: ");
        int number = new Scanner(System.in).nextInt();
        System.out.println("The " + number + " Fibonacci number is: ");
        System.out.print(fib(number) + " ");
    }

    public static int fib(int number) {
        if (number > 2) {
            return fib(number-1)+fib(number-2);
        } else {
            return  1;
        }
    }
}