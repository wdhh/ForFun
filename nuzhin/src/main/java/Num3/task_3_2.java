package Num3;

/**
 * Created by IVAN on 11/19/2016.
 */

/*

Задача C. Два подарка
Сеня выбирает себе подарки на новый год. Он знает, что Дед Мороз купит ему ровно
два подарка: один якобы от мамы, а другой якобы от папы.
В магазине, где Дед Мороз будет покупать подарки, продаётся n подарков, про каждый
подарок известна его цена: цена i-го подарка равна ai рублей. Сеня знает, что Дед Мороз
может потратить на покупку его подарков не больше x рублей. Разумеется, он хочет полу-
чить как можно более дорогие подарки. Таким образом, он хочет выбрать два различных
подарка с максимальной суммарной ценой, но при этом она не должна превышать x.
Помогите Сене выбрать себе подарки.
Формат входных данных
Первая строка ввода содержит два целых числа: n и x (2 ≤ n ≤ 100 000, 2 ≤ x ≤ 109
).
Вторая строка ввода содержит n целых чисел: a1, a2, . . . , an (1 ≤ ai ≤ 109
). Гарантируется,
что существует два подарка с суммарной ценой не больше x.
Формат выходных данных
Выведите одно целое число: максимальную суммарную цену двух различных подарков,
не превышающую x.
Пример
стандартный ввод стандартный вывод
6 18
5 3 10 2 4 9
1

ввод два числа n 2-100000  x 2-109
вводим  n чисел 1 - 109
выводим два числа чья сумма максимальна и не больше x

*/

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class task_3_2 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество подарков ");
        int n = in.nextInt();;
        System.out.println("Введите максимальную  сумму двух подарков ");
        int x = in.nextInt();;

         int[] Arr = new int[n];
        for (int i = 0; i < Arr.length; i++){
            Arr[i] = ThreadLocalRandom.current().nextInt(1 , 109 +1);

        }

        int result = 0;
        for (int i = 0; i < Arr.length; i++) {
            for (int j = i+1; j < Arr.length; j++) {
                if (Arr[i] + Arr[j] > result && Arr[i] + Arr[j] <= x){
                    result = Arr[i] + Arr[j];
                }
            }
        }

        System.out.println(result);

    }
}