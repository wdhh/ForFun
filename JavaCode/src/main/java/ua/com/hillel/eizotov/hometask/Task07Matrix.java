package ua.com.hillel.eizotov.hometask;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by admin on 01-Mar-17.
 * Дана матрица n * m. В ней произвольные числа.
 * Нужно сложить смежные с каждым элементом значения и записать вместо него.
 * Результат - новая матрица.
 *
 */
public class Task07Matrix {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrixNeo = createMatrix();
        drawMatrix(matrixNeo);
        drawMatrix(summMatrix(matrixNeo));
    }

    private static ArrayList<ArrayList<Integer>> summMatrix(ArrayList<ArrayList<Integer>> matrixBefore) {
        ArrayList<ArrayList<Integer>> intArray = new ArrayList<>();
        for (int i = 0; i < matrixBefore.size(); i++) {
            ArrayList<Integer> newRow = new ArrayList<>();
            int cols = matrixBefore.get(i).size();
            for (int j = 0; j < cols; j++) {
                Integer number = matrixBefore.get(i).get(j);
                if (i > 0 && j > 0) {
                    number = number + matrixBefore.get(i - 1).get(j - 1);
                }
                if (i > 0 && j >= 0) {
                    number = number + matrixBefore.get(i - 1).get(j);
                }
                if (i > 0 && j < matrixBefore.get(i).size() - 1) {
                    number = number + matrixBefore.get(i - 1).get(j + 1);
                }
                if (j > 0) {
                    number = number + matrixBefore.get(i).get(j - 1);
                }
                if (j < matrixBefore.get(i).size() - 1) {
                    number = number + matrixBefore.get(i).get(j + 1);
                }
                if (i < matrixBefore.size() - 1 && j > 0) {
                    number = number + matrixBefore.get(i + 1).get(j - 1);
                }
                if (i < matrixBefore.size() - 1) {
                    number = number + matrixBefore.get(i + 1).get(j);
                }
                if (i < matrixBefore.size() - 1 && j < matrixBefore.get(i).size() - 1) {
                    number = number + matrixBefore.get(i + 1).get(j + 1);
                }
                newRow.add(j, number);
            }
            intArray.add(i, newRow);
        }
        return intArray;
    }

    private static void drawMatrix(ArrayList<ArrayList<Integer>> matrix) {
        for (ArrayList<Integer> aMatrix : matrix) {
            System.out.println(aMatrix);
        }
    }

    private static ArrayList<ArrayList<Integer>> createMatrix() {
        System.out.println("Input number of columns (3-20) and number of rows (3-20):");
        Scanner scanner = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> intArray = new ArrayList<>();
        try {
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            if (m < 3 || m > 20 || n < 3 || n > 20) {
                System.out.println("Incorrect input!!!");
                return null;
            }
            try {
                for (int i = 0; i < n; i++) {
                    ArrayList<Integer> newRow = new ArrayList<>();
                    for (int j = 0; j < m; j++) {
                        Random rand = new Random();
                        Integer number = rand.nextInt(100 + 1);
                        newRow.add(number);
                    }
                    intArray.add(newRow);
                }
            } catch (Exception e) {
                System.out.println("Incorrect input!!!" + e);
            }
        } catch (Exception e) {
            System.out.println("Incorrect input!!!");
        }
        return intArray;
    }
}
