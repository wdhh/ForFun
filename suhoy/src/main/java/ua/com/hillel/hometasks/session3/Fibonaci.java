package ua.com.hillel.hometasks.session3;
import java.util.Scanner;
/**
 * Created by dreasty on 20.11.16.
 * Напишите функцию fib(n), которая по данному целому
 * неотрицательному n возвращает n-e число Фибоначчи.
 * В этой задаче нельзя использовать циклы — используйте рекурсию.
 */
public class Fibonaci {

        public static void main(String[] args)
        {
            int index;
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите число:\n");
            index = sc.nextInt();
            System.out.println(fib(index));
        }

        public static int fib(int i)
        {
            if (i == 0) return 0;
            if (i <= 2) return 1;
            return fib(i - 1) + fib(i - 2);
        }

    }