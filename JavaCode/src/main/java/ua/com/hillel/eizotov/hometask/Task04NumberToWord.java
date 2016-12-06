package ua.com.hillel.eizotov.hometask;

import com.ibm.icu.text.RuleBasedNumberFormat;
import java.util.Locale;
import java.util.Scanner;


/**
 * Created by Ed Izotov on 05-Dec-16.
 * Numbers to words
 * Input a number 1 - 9999
 */

public class Task04NumberToWord {
    public static void main(String[] args) {
        RuleBasedNumberFormat numberFormat = new RuleBasedNumberFormat(Locale.forLanguageTag("ru"), RuleBasedNumberFormat.SPELLOUT);
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a integer number between 1 - 9999:");
        try {
            number = scanner.nextInt();
            if (number < 1 || number > 9999) {
                System.out.print("Incorrect value entered!");
            } else {
                int lastDigit = number % 10;
                int penultimate = number / 10;
                penultimate = penultimate % 10;
                System.out.println(numberFormat.format(number) + " " + returnDollarsWord(lastDigit, penultimate));
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
