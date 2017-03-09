package Num3;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by IVAN on 11/19/2016.
 */

/*
Напишите функцию fib(n), которая по данному целому неотрицательному n возвращает n-e число Фибоначчи.
В этой задаче нельзя использовать циклы — используйте рекурсию.
 */
public class task_3_1 {
    public static void main(String[] args) {

        String start_msg = "Введите целое неотрицательное число, получите число Фибоначчи у которого индекс равен введенному числу. ";
        System.out.println(start_msg);
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        System.out.println(fib(input));
    }

            static int fib(int i) {
                return i<=1 ? i : (fib(i - 1) + fib(i - 2));
            }


    }

