package Task3;

/**
 * Программа должна создать массив из 12 случайных целых чисел из отрезка [-10;10] таким образом,
 * чтобы отрицательных и положительных элементов там было поровну и не было нулей.
 * При этом порядок следования элементов должен быть случаен (т. е. не подходит вариант,
 * когда в массиве постоянно выпадает сначала 6 положительных, а потом 6 отрицательных
 * чисел или же когда элементы постоянно чередуются через один и пр.). Вывести полученный массив на экран.
 */
public class Task3Array12Numbers {
    public static void main(String[] args){
        int[] Mas = new int[12];
        int pos = 0; //posive numbers quantity
        int neg = 0; //negative numbers quantity
        do {
            for(int i = 0; i < Mas.length; i++){
                Mas[i] = (int)(Math.random()*21)-10; //increase pos/neg meanings from -10 +10, Math.random return double from 0 to 1
                if(Mas[i] > 0){
                    pos++;
                }
                if(Mas[i] < 0){
                    neg++;
                }
                if(Mas[i] == 0){
                    --i; // if meanign is 0 full again
                }
                if((i == Mas.length-1) & (pos != Mas.length/2)){
                    pos = 0;
                    neg = 0; // if pos not equal neg make counters zero
                }
            }
        }
        while ((pos != Mas.length/2) & (neg != Mas.length/2));
        for(int i = 0; i < Mas.length; i++) {
            System.out.print(Mas[i] + " ");
        }
    }

}
/**
 * Странный способ, теоретически оно может не закончить работу никогда и выполняется долго
 * По идее должен быть другой
 */