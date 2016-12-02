package ua.com.hillel.eizotov.hometask;

import java.util.Scanner;

/**
 * Created by Ed Izotov on 02-Dec-16.
 * n - (2 <= n <= 20) q-ty of gifts in a shop
 * x - (2 <= x <= 10^9) total amount (money)
 * a1 a2 ... an - price of gifts
 * Output int number of total price with max sum of 2 gifts
 */
public class Task02Gifts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int n = scanner.nextInt();
            int x = scanner.nextInt();

            if (n < 2 || n > 20 || x < 2 || x > 1000000000) {
                System.out.println("Incorrect input!!!");
                return;
            }

            int[] arrGifts = new int[n];

            try {
                for (int i = 0; i < n; i++) {
                    arrGifts[i] = scanner.nextInt();
                }

                System.out.println(SumGifts(x, arrGifts));

            } catch (Exception e) {
                System.out.println("Incorrect input!!!");
            }

        } catch (Exception e) {
            System.out.println("Incorrect input!!!");
        }
    }

    private static int SumGifts(int totalAmount, int[] integers) {
        int sum = 0;
        for (int i = 0; i < integers.length - 1; i++) {
            for (int j = i + 1; j < integers.length; j++) {
                int xxx = integers[i] + integers[j];
                if (xxx > sum && xxx <= totalAmount) {
                    sum = xxx;
                }
            }
        }
        return sum;
    }
}
