package ua.com.hillel.eizotov.hometask;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Ed Izotov on 03-Dec-16.
 * Random array with positive and negative integers
 */
public class Task03RandomIntArray {
    public static void main(String[] args) {
        int minRange = -10;
        int maxRange = 10;
        int countPositive = 0;
        int countNegative = 0;
        ArrayList<Integer> intArray = new ArrayList<Integer>();
        System.out.println(CreateRandomArr(minRange, maxRange, countPositive, countNegative, intArray));
    }

    private static ArrayList<Integer> CreateRandomArr(int min, int max, int countPos, int countNeg, ArrayList<Integer> arr) {
        Random rand = new Random();
        int number = min + rand.nextInt(max - min + 1);
        if (number > 0 && countPos < 6) {
            arr.add(number);
            countPos++;
        } else if (number < 0 && countNeg < 6) {
            arr.add(number);
            countNeg++;
        }
        if  (arr.size() < 12) {
            CreateRandomArr(min, max, countPos, countNeg, arr);
        }
        return arr;
    }
}
