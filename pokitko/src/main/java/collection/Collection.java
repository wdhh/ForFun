package collection;


import java.util.Iterator;
import java.util.Vector;

public class Collection {
    static Vector vector = new Vector();
    public static void main(String[] args) {
        System.out.println(vector);
        vector.add("Potter");
        vector.add("Ivan");

        Vector vector2 = new Vector();
        vector2.setSize(5);
        vector.add(vector2);


        vector.add(0, "Kira");
        vector.add("Ivan");




        Iterator iterator = vector.iterator();
        while (iterator.hasNext()) {
            Object currentElement = iterator.next();
            System.out.println(currentElement.getClass());
            if (currentElement.getClass().equals("java.util.Vector")){
                ((Vector)currentElement).set(0,234);
            }
            System.out.println(currentElement);
        }
    }
}
