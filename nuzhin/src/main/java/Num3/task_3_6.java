package Num3;
import java.util.Scanner;
/**
 * Created by IVAN on 11/19/2016.
 */

/*
Ввести с консоли последовательность  произвольных чисел произвольной длины.
Вывести число которое повторяется больше одного раза и его индексы
 */
public class task_3_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String start_msg = "Ввести последовательность  произвольных чисел произвольной длины в одной строке. ";
        String start_msg1 = "В качестве разделителя между числами используйте пробел";
        String end_msg = "Нажмите 'Q' для выхода либо кнопку AnyKey для повтора";

        String end = "";
        do{
            System.out.println(start_msg);
            System.out.println(start_msg1);
            String input = in.nextLine();
            //in.nextLine();
            String tmp_string_Arr[] = input.split(" ");

            double Arr[][] = new double[tmp_string_Arr.length][2];
            for (int i = 0; i < tmp_string_Arr.length; i++) {
                Arr[i][0] = Integer.parseInt(tmp_string_Arr[i]);
            }

            for(int i = 0 ; i < Arr.length ; i++){
                Integer count_of_value = 0;
                for(int j = i+1 ; j < Arr.length ; j++){
                    if(Arr[j][0] == Arr[i][0] && Arr[j][1] !=1){

                        if(count_of_value==0){
                            System.out.println();
                            if(Arr[i][0] % 1 == 0) {
                                //cast to int if needed
                                int tmp = (int)Arr[i][0];
                                System.out.print( tmp + " имеет индексы " + i + ", " + j);
                            }else{
                                System.out.print(Arr[i][0]  + " имеет индексы " + i + ", " + j);
                            }
                            count_of_value++;
                            Arr[j][1] =1;
                        }else if(count_of_value > 0){
                            System.out.print( ", " + j );
                            Arr[j][1] =1;
                        }


                    }
                }


            }

            System.out.println();



            System.out.println(end_msg);
            end = in.next();
            in.nextLine();
        }while(!end.equalsIgnoreCase("Q"));
    }
}
