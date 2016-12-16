package Task6;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 */
public class Task6ModaNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String string1 = "Input number: ";
        System.out.println(string1);
        String inputFromKeyboard = scanner.nextLine();

        long start = System.nanoTime();

        String stringArray[] = inputFromKeyboard.split(" ");


        Map < Integer, Vector<Integer>> dataMap = new HashMap <Integer, Vector<Integer>>();
        for (int i = 0; i < stringArray.length; i++) {
            Integer inputValue =  Integer.parseInt(stringArray[i]);
            if (!dataMap.containsKey(inputValue)) {
                dataMap.put(inputValue, new Vector<Integer>());
            }
            dataMap.get(inputValue).add(i);
        }

        for (Map.Entry<Integer, Vector<Integer>> mapIterator:
        dataMap.entrySet()) {
            if (mapIterator.getValue().size() > 1) {
                System.out.println(mapIterator.getKey() + " : " + mapIterator.getValue());
            }
        }
        double workTime = ( System.nanoTime() - start ) / 1000000;
        System.out.println( "time: " + workTime  + "ms") ;
    }
}
