package hillel.task1;

import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {
        System.out.println("Введите операцию:");
        System.out.println("1. Сложение");
        System.out.println("2. Вычитание");
        System.out.println("3. Умножение");
        System.out.println("4. Деление");
        System.out.println("5. Остаток от деления");
        System.out.println("6. Модуль числа");
        Scanner scanner = new Scanner(System.in);
        int operation = scanner.nextInt();
        System.out.println("Введите первое число:");
        double a = scanner.nextDouble();
        System.out.println("Введите второе число:");
        double b = scanner.nextDouble();
        double result;
        if (operation == 1) {
            result = a + b;
        } else if (operation == 2) {
            result = a - b;
        } else if (operation == 3) {
            result = a * b;
        } else if (operation == 4) {
            result = a / b;
        } else if (operation == 5) {
            result = a % b;
        } else {
            result = Math.abs(a);
        }
        System.out.println("Результат = " + result);

    }
}


