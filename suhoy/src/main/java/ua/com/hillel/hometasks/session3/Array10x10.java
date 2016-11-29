package ua.com.hillel.hometasks.session3;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by dreasty on 20.11.16.
 *
 * Программа должна создать массив из 12 случайных
 * целых чисел из отрезка [-10;10] таким образом,
 * чтобы отрицательных и положительных элементов
 * там было поровну и не было нулей.
 * При этом порядок следования элементов должен
 * быть случаен (т. е. не подходит вариант,
 * когда в массиве постоянно выпадает
 * сначала 6 положительных, а потом 6 отрицательных
 * чисел или же когда элементы постоянно чередуются
 * через один и пр.). Вывести полученный массив на экран.
 */

public class Array10x10 {
    public static int neg;
    public static int pos;
    public static void main(String[] args) {
        int[] a;
        a = new int[12] ;
       for(int i=0; i < a.length;){
            Integer rand = -10 + (int)(Math.random() * ((10 -(-10)) + 1));
            String strand = rand.toString();
            if (!Arrays.toString(a).contains(strand) && rand!=0 ){
//                if(neg < 6 && rand <0){
//                    a[i]=rand;
//                    neg++;
//                }
//
//                else if(pos < 6 && rand >0){
//                    a[i]=rand;
//                    pos++;
//                }
                a[i]=rand;
                i++;
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println(neg+ "" + pos);
    }
}