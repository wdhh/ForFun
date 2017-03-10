package ua.com.hillel.eizotov.hometask;

import java.util.*;

/**
 * Created by Ed Izotov on 21-Dec-16.
 * Ввести с консоли последовательность  произвольных чисел произвольной длины. Вывести число которое повторяется больше одного раза и его индексы
 */
public class Task06InputNumbers {
    public static void main(String[] args) {
        outputResult(findDuplicates(readLine()));
    }

    private static ArrayList<Integer> readLine() {
        System.out.println("Input number in format 'INTEGER INTEGER ... ' and press Enter key");
        Scanner scanner = new Scanner(System.in);
        String line = "";
        try {
            line = scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Incorrect reading!");
        }
        Scanner scanLine = new Scanner(line);
        ArrayList<Integer> intArray = new ArrayList<>();
        try {
            while (scanLine.hasNextInt()) {
                int a = scanLine.nextInt();
                intArray.add(a);
            }
        } catch (Exception e) {
            System.out.println("Incorrect value entered!");
        }
        return intArray;
    }

    private static Map<Integer, ArrayList<Integer>> findDuplicates(ArrayList<Integer> arr) {
        Map<Integer, ArrayList<Integer>> result = new HashMap<>();
        for (int i = 0; i < arr.size() - 1; i++) {
            ArrayList<Integer> indexes = new ArrayList<>();
            indexes.add(i);
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i).equals(arr.get(j)) && (i != j) && (!result.containsKey(j)) && (!result.containsKey(arr.get(i)))) {
                    indexes.add(j);
                }
            }
            if (indexes.size() > 1) {
                result.put(arr.get(i), indexes);
            }
        }
        return result;
    }

    private static void outputResult(Map<Integer, ArrayList<Integer>> mapOfDuplicates) {
        for (Map.Entry<Integer, ArrayList<Integer>> map: mapOfDuplicates.entrySet()) {
            System.out.println(map.getKey() + ": " + map.getValue());
        }
    }
}
