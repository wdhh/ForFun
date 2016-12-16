package Task2;

import java.util.Scanner;

/**
 * Created by tania on 12/13/16.
 */
public class Task2TwoGifts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of gifts and max cost: ");
        int numberOfGifts = scanner.nextInt();
        int maxCost = scanner.nextInt();
        System.out.println("Available gifts prices: ");
        //int maxCost = scanner.nextInt();

        if (numberOfGifts < 2 || numberOfGifts > 20 || maxCost < 2 || maxCost > 1000000000) {
            System.out.println("Out of range");
            return;
        }

        int[] giftArray = new int[numberOfGifts];

        for (int i = 0; i < numberOfGifts; i++) {
            giftArray[i] = scanner.nextInt();
        }

        System.out.println(GiftsCostSum(maxCost, giftArray));
    }

    private static int GiftsCostSum(int totalRealCost, int[] oneGiftCostArray) {
        int sum = 0;
        for (int i = 0; i < oneGiftCostArray.length - 1; i++) {
            for (int j = i + 1; j < oneGiftCostArray.length; j++) {
                int result = oneGiftCostArray[i] + oneGiftCostArray[j];
                if (result > sum && result <= totalRealCost) {
                    sum = result;
                }
            }
        }
        return sum;
    }
}








