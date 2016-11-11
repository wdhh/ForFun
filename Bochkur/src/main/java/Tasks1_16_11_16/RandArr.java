package Tasks1_16_11_16; /**
 Задание 3:
 Программа должна создать массив из 12 случайных целых чисел из отрезка [-10;10] таким образом,
 чтобы отрицательных и положительных элементов там было поровну и не было нулей. При этом порядок
 следования элементов должен быть случаен (т. е. не подходит вариант, когда в массиве постоянно
 выпадает сначала 6 положительных, а потом 6 отрицательных чисел или же когда элементы постоянно
 чередуются через один и пр.). Вывести полученный массив на экран.
 */

import java.util.Arrays;


public class RandArr {
    public static int neg = 0, pos = 0;

    public static void main(String[] args) {

        int[] Arr = new int[12];

        for (int i = 0; i < 12; ) {
            int ran = (int) (Math.random() * (10 - (-10)) + 1) + (-10);
            if (neg < 6 && ran < 0) {
                Arr[i] = ran;
                neg++; i++;
            }
            if (pos < 6 && ran > 0) {
                Arr[i] = ran;
                pos++; i++;
            }
            else {
                continue;
            }
        }
        System.out.println(Arrays.toString(Arr));
        System.out.println("(-)"+neg + " " +"(+)"+pos);
    }
}