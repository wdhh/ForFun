/**
 * Сделать свертку произвольной матрицы  (mxn: m,n>3) матрицы, фильтром 3x3 за законом:
 */

import java.util.*;
import java.lang.*;
public class Matrix {
    static double matrixA[][];
    public static void main(String[] args){
        Random randomGenerator = new Random();
        int m = 3;
        int n = 3;
        matrixA = new double[m][n];
        for(int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++){
                matrixA[i][j] = randomGenerator.nextDouble();
            }
        }
        System.out.println("Input:");
        printArray(matrixA);
        System.out.println();
        System.out.println("Output:");
        printArray(summa(matrixA));
    }

    public static void printArray(double matrix[][]) {
        for (double[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static double[][] summa(double[][] input){
        double[][] output = new double[input.length][input[0].length];
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++){
                output[i][j] = getItemSum(input, i, j);
            }
        }
        return output;
    }

    public static double getItemSum(double[][] input, int indexI, int indexJ){
        double output = 0;
        int minI = indexI == 0 ? 0 : -1;
        int maxI = indexI == input.length - 1 ? 0 : 1;
        int minJ = indexJ == 0 ? 0 : -1;
        int maxJ = indexJ == input[indexI].length - 1 ? 0 : 1;
        for (int i = minI; i <= maxI; i++){
            for (int j = minJ; j <= maxJ; j++){
                output += input[indexI + i][indexJ + j];
            }
        }
        return output;
    }
}
