package ua.com.hillel.eizotov.hometask;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Ed Izotov on 21-Dec-16.
 * Ввести с консоли последовательность  произвольных чисел произвольной длины. Вывести число которое повторяется больше одного раза и его индексы
 */
public class Task06InputNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number in format 'INTEGER INTEGER ... '. Press CTRL+D (Windows) or CTRL+Z (Unix) to finish input");
        ArrayList<Integer> intArray = new ArrayList<>();

        while (scanner.hasNext()) {
            try {
                int a = scanner.nextInt();
                System.out.println(a);
                intArray.add(a);
            } catch (Exception e) {
                System.out.println("Incorrect value entered!");
            }
        }

        System.out.println(intArray);
        for (Integer i: intArray) {
            System.out.println(i);
        }

    }

}
