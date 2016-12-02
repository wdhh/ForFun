package ua.com.hillel.eizotov.hometask;


import java.util.Scanner;


/**
 * Created by Ed Izotov on 01-Dec-16.
 * Напишите функцию fib(n), которая по данному целому
 * неотрицательному n возвращает n-e число Фибоначчи.
 * В этой задаче нельзя использовать циклы — используйте рекурсию.
 */
public class Task01Fibonacci {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a integer number > 0 to receive Fibonacci number: ");
        try {
            number = scanner.nextInt();
            if (number > 0) {
                System.out.print("You entered ");
                System.out.println(number);
                System.out.println(Fibonacci(number));
            } else {
                System.out.println("Incorrect value entered!");
                System.out.println("It should be positive integer!");
            }

        } catch (Exception e) {
            System.out.println("Incorrect value entered!");
            System.out.println("It should be positive integer!");
        }
    }

    private static int Fibonacci(int num) {
        if (num == 1) {
            return 0;
        } else if (num <= 3) {
            return 1;
        } else {
            int fib;
            fib = Fibonacci(num - 1) + Fibonacci(num - 2);
            return fib;
        }
    }
}
