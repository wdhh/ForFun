//package Les6;
//
///**
// * Created by GL551 on 25.11.2016.
// */
//
//
//
//import java.util.Vector;
//import java.util.Iterator;
//
//public class VectorEx {
//    static Vector vector = new Vector();
//    public static void main(String[] args) {
//        //vector.setSize(5);
//        System.out.println(vector);
//        vector.add("Potter");
//        vector.add("Ivan");
//        Vector vector2= new Vector();
//        vector2.setSize(5);
//
//
//        vector.add(vector2);
//        //System.out.println(vector);
//        vector.add( 0, "Kira");
//        System.out.println(vector);
//
//        vector.add("Vasya");
//        //System.out.println(vector);
//        //System.out.println (vector.contains("Vasya"));
//        //vector.remove ("Vasya");
//        //vector.retainAll();
//
//
//        Iterator iterator = vector.iterator();
//        while (iterator.hasNext()) {
//            Object currentElement = iterator.next();
//            if (currentElement.getClass().getName().equals("java.util.Vector")) {
//                //System.out.println("TTTTTT");
//                ((Vector)currentElement).set(0, "234");
//            }
//           System.out.println(currentElement);
//        }
//    }
//}
