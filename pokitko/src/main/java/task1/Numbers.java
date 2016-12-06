package task1;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String [] values = line.split(" ");
        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < values.length; i++) {
            int x = Integer.valueOf(values[i]);
            numbers.add(x);
        }
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 0; j < numbers.size(); j++) {
              if (j!=i){
                 if (numbers.get(i) == numbers.get(j)){
                     System.out.println("Number: " + numbers.get(i));
                     System.out.println("Index: " + i);
                     break;
                 }
              }
            }
        }
    }
}
