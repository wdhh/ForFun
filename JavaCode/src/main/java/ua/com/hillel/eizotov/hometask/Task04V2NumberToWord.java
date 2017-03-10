package ua.com.hillel.eizotov.hometask;

import java.util.Scanner;

/**
 * Created by Ed Izotov on 05-Dec-16.
 * Numbers to words
 * Input a number 1 - 9999
 */

public class Task04V2NumberToWord {

    private static final String[] thousandsNames = {
            "",
            "одна тысяча",
            "две тысячи",
            "три тысячи",
            "четыре тысячи",
            "пять тысяч",
            "шесть тысяч",
            "семь тысяч",
            "восемь тысяч",
            "девять тысяч"
    };

    private static final String[] hundredsNames = {
            "",
            "сто",
            "двести",
            "триста",
            "четыреста",
            "пятьсот",
            "шестьсот",
            "семьсот",
            "восемьсот",
            "девятьсот"
    };

    private static final String[] tensNames1 = {
            "",
            "одиннадцать",
            "двенадцать",
            "тринадцать",
            "четырнадцать",
            "пятнадцать",
            "шестнадцать",
            "семнадцать",
            "восемнадцать",
            "девятнадцать"
    };

    private static final String[] tensNames = {
            "",
            "",
            "двадцать",
            "тридцать",
            "сорок",
            "пятьдесят",
            "шестьдесят",
            "семьдесят",
            "восемьдесят",
            "девяносто"
    };

    private static final String[] numsNames = {
            "",
            "один",
            "два",
            "три",
            "четыре",
            "пять",
            "шесть",
            "семь",
            "восемь",
            "девять"
    };

    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a integer number between 1 - 9999:");
        try {
            number = scanner.nextInt();
            if (number < 1 || number > 9999) {
                System.out.print("Incorrect value entered!");
            } else {
                int digit4 = number % 10;
                int digit3 = number / 10;
                int digit2 = number / 100;
                int digit1 = number / 1000;
                digit3 = digit3 % 10;
                digit2 = digit2 % 10;
                digit1 = digit1 % 10;
                String str = "";
                if (digit1 != 0) {
                    str = thousandsNames[digit1];
                }
                if (digit2 != 0) {
                    str = str + " " + hundredsNames[digit2];
                }
                if (digit3 == 1) {
                    str = str + " " + tensNames1[digit4];
                } else if (digit3 != 0) {
                    str = str + " " + tensNames[digit3];
                }
                if (digit4 != 0 && digit3 != 1) {
                    str = str + " " + numsNames[digit4];
                }
                System.out.println(str.replaceAll("\\s+", " ").trim() + " " + returnDollarsWord(digit4, digit3));
            }
        } catch (Exception e) {
            System.out.println("Incorrect value entered!");
        }
    }

    private static String returnDollarsWord(int digit, int penultimate) {
        if (penultimate == 1) {
            return "долларов";
        }
        if (digit == 1) {
            return "доллар";
        } else if ((digit >= 5 && digit <= 9) || digit == 0) {
            return "долларов";
        } else if (digit > 1 && digit < 5) {
            return "доллара";
        } else {
            System.out.println("Incorrect value entered!");
            return null;
        }
    }
}
