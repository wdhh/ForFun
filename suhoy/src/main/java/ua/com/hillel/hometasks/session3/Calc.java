package ua.com.hillel.hometasks.session3;

import java.util.Scanner;

/**
 * Created by dreasty on 20.11.16.
 *Создайте калькулятор, который выполняет, базовые арифметические операции:
 - умножение;
 - деление;
 - сложение;
 - вычитание;
 - остаток от деления ;
 - нахождение модуля числа.
 Позьзователь вводит операцию и операнды
 */
public class Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, i;

        while (true){
            System.out.println("\nВыбирите операцию: ");
            System.out.println("1. Умножение");
            System.out.println("2. Деление");
            System.out.println("3. Сложение");
            System.out.println("4. Вычитание");
            System.out.println("5. Остаток от деления");
            System.out.println("6. Модуль от числа");
            System.out.println("0. Выход\n");

            i = sc.nextInt();
            if (i == 1) {
                System.out.println("Введите первое число:");
                a = sc.nextInt();
                System.out.println("Введите второе число:");
                b = sc.nextInt();
                System.out.println("Результат умножения "+ a + " на " + b +" = "+ multiple(a,b));
            }
            if (i == 2) {
                System.out.println("Введите первое число:");
                a = sc.nextInt();
                System.out.println("Введите второе число:");
                b = sc.nextInt();
                if(b != 0){
                System.out.println("Результат деления "+ a + " на " + b +" = "+ div(a,b));
                }
                else {
                    System.out.println("Вы не можете поделить на ноль!\n");
                    continue;
                }
            }
            if (i == 3) {
                System.out.println("Введите первое число:");
                a = sc.nextInt();
                System.out.println("Введите второе число:");
                b = sc.nextInt();
                System.out.println("Результат сложения "+ a + " на " + b +" = "+ sum(a,b));
            }
            if (i == 4) {
                System.out.println("Введите первое число:");
                a = sc.nextInt();
                System.out.println("Введите второе число:");
                b = sc.nextInt();
                System.out.println("Результат вычитания "+ a + " на " + b +" = "+ sub(a,b));
            }
            if (i == 5) {
                System.out.println("Введите первое число:");
                a = sc.nextInt();
                System.out.println("Введите второе число:");
                b = sc.nextInt();
                System.out.println("Остаток от деления "+ a + " на " + b +" = "+ mod(a,b));
            }
            if (i == 6) {
                System.out.println("Введите число:");
                a = sc.nextInt();
                System.out.println("Модуль числа  "+ a +" = "+ Math.abs(a));
            }
            if (i == 0){
                break;
            }

            }

        }

    public static int multiple(int a, int b){
        return a*b;
    }
    public static int sum(int a, int b){
        return a+b;
    }
    public static double div(int a, int b){
        return (double)a / (double)b;
    }

    public static int sub(int a, int b){
        return a-b;
    }
    public static int mod(int a, int b){
        return a % b;
    }

    }
