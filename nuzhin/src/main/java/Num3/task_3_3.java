package Num3;
import java.util.concurrent.ThreadLocalRandom;
/**
 * Created by IVAN on 11/19/2016.

Программа должна создать массив из 12 случайных целых чисел из отрезка [-10;10] таким образом,
 чтобы отрицательных и положительных элементов там было поровну и не было нулей.
  При этом порядок следования элементов должен быть случаен (т. е. не подходит вариант,
  когда в массиве постоянно выпадает сначала 6 положительных, а потом 6 отрицательных чисел
   или же когда элементы постоянно чередуются через один и пр.).
 Вывести полученный массив на экран.
 */

public class task_3_3 {
    public static void main(String[] args) {
        int[] Arr = new int[12];
        for(int i =0 ; i <6; i++){
            int rand = ThreadLocalRandom.current().nextInt(0 , 11 +1);
            if(Arr[rand] == 0){
                Arr[rand] = ThreadLocalRandom.current().nextInt(1 , 10 +1);
            }else {
                i--;
            }
        }
        for(int i =0 ; i < Arr.length; i++){
            if(Arr[i] ==0){
                Arr[i] = ThreadLocalRandom.current().nextInt(-10 , -1 +1);
            }
        }
        for(int i =0 ; i < Arr.length; i++){
            System.out.print(Arr[i] + " ");
        }
        System.out.println();
    }
}
