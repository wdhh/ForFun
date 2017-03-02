package ua.com.hillel.eizotov.hometask;

import java.util.Scanner;

/**
 * Created by Ed Izotov on 10-Dec-16.
 * Calculator
 */
public class Task05Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1;
        int number2;
        char operand;
        System.out.println("Input an operation in format 'INTEGER OPERAND INTEGER' and press Enter key.");
        System.out.println("Where OPERAND is +, -, /, *, %");
        System.out.println("Or an operation in format 'INTEGER |' to take module of number:");
        try {
            number1 = scanner.nextInt();
            operand = scanner.next().charAt(0);
            if (operand != '|') {
                number2 = scanner.nextInt();
                if (operand == '/' && number2 == 0) {
                    System.out.println("Incorrect dividing with 0!");
                    return;
                }
                System.out.println(Calc(number1, operand, number2));
                return;
            }
            System.out.println(Calc(number1, operand, 0));
        } catch(Exception e) {
            System.out.println("Incorrect value entered!");
        }

    }

    private static int Calc(int a, char oper, int b) {
        if (oper == '+') {
            return a + b;
        } else if (oper == '-') {
            return a - b;
        } else if (oper == '*') {
            return a * b;
        } else if (oper == '/') {
            return a / b;
        } else if (oper == '%') {
            return a % b;
        } else if (oper == '|') {
            return Math.abs(a);
        }
        return 0;
    }
}
