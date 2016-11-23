
package Num3;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;
import java.util.Scanner;

/*
 Created by IVAN on 11/19/2016.

Пользователь вводит число от 1 до 9999 (сумму выдачи в банкомате).
Необходимо вывести на экран словами введенную сумму и в конце написать название валюты с правильным окончанием.
 Например: 7431 — семь тысяч четыреста тридцать один доллар,
 2149 — две тысячи сто сорок девять долларов, 15 — пятнадцать долларов, 3 — три доллара. 
 */


public class task_3_4 {
    public static void main(String[] args) {
        //msg
        String currency_1 = "доллар";
        String currency_2_to_4 = "доллара";
        String currency_5_to_20 = "долларов";
        String n_1 = "один ";
        String n_2 = "два ";
        String n_3 = "три ";
        String n_4 = "четыре ";
        String n_5 = "пять ";
        String n_6 = "шесть ";
        String n_7 = "семь ";
        String n_8 = "восемь ";
        String n_9 = "девять ";
        String n_10 = "десять ";
        String n_11 = "одинадцать ";
        String n_12 = "двенадцать ";
        String n_13 = "тринадцать ";
        String n_14 = "четырнадцать ";
        String n_15 = "пятнадцать ";
        String n_16 = "шестнадцать ";
        String n_17 = "семнадцать ";
        String n_18 = "восемнадцать ";
        String n_19 = "девятнадцать ";
        String n_20 = "двадцать ";
        String n_30 = "тридцать ";
        String n_40 = "сорок ";
        String n_50 = "пятдесят ";
        String n_60 = "шестдесят ";
        String n_70 = "семдесят ";
        String n_80 = "восемдесят ";
        String n_90 = "девяносто ";
        String n_100 = "сто ";
        String n_200 = "двести ";
        String n_300 = "триста ";
        String n_400 = "четыреста ";
        String n_500 = "пятсот ";
        String n_600 = "шестсот ";
        String n_700 = "семсот ";
        String n_800 = "восемсот ";
        String n_900 = "девятсот ";
        String n_1000 = "тысяча ";
        String n_2000 = "две тысячи ";
        String n_3000 = "три тысячи ";
        String n_4000 = "четыре тысячи ";
        String n_5000 = "пять тысяч ";
        String n_6000 = "шесть тысяч ";
        String n_7000 = "семь тысяч ";
        String n_8000 = "восемь тысяч ";
        String n_9000 = "девять тысяч ";

        String input_msg = "Введите число в диапазоне от 1 до 9999";
        String incorrect_input = "Введеное число либо не в диапазоне от 1 до 9999, либо не является числом";
        String end_msg = "Нажмите 'Q' для выхода либо кнопку AnyKey для повтора";

        String end = "";
do {
    Scanner in = new Scanner(System.in);
    Integer input =0;
    String result = "";


    System.out.println(input_msg);
    try {
        if(in.hasNextInt()){
            input = in.nextInt();
            if (input <1 || input > 9999){
                System.out.println(incorrect_input);
                //in.nextLine();
                //input = 0;
                end = "";
                continue;
            }


            if( (input/1000) % 10 == 1) {result += n_1000;}
            if( (input/1000) % 10 == 2) {result += n_2000;}
            if( (input/1000) % 10 == 3) {result += n_3000;}
            if( (input/1000) % 10 == 4) {result += n_4000;}
            if( (input/1000) % 10 == 5) {result += n_5000;}
            if( (input/1000) % 10 == 6) {result += n_6000;}
            if( (input/1000) % 10 == 7) {result += n_7000;}
            if( (input/1000) % 10 == 8) {result += n_8000;}
            if( (input/1000) % 10 == 9) {result += n_9000;}

            if( (input/100) % 10 == 1) {result += n_100;}
            if( (input/100) % 10 == 2) {result += n_200;}
            if( (input/100) % 10 == 3) {result += n_300;}
            if( (input/100) % 10 == 4) {result += n_400;}
            if( (input/100) % 10 == 5) {result += n_500;}
            if( (input/100) % 10 == 6) {result += n_600;}
            if( (input/100) % 10 == 7) {result += n_700;}
            if( (input/100) % 10 == 8) {result += n_800;}
            if( (input/100) % 10 == 9) {result += n_900;}

            if( (input/10) % 10 == 1) {

                if( (input) % 10 == 1) {result = result + n_11 + currency_5_to_20;}
                if( (input) % 10 == 2) {result = result + n_12 + currency_5_to_20;}
                if( (input) % 10 == 3) {result = result + n_13 + currency_5_to_20;}
                if( (input) % 10 == 4) {result = result + n_14 + currency_5_to_20;}
                if( (input) % 10 == 5) {result = result + n_15 + currency_5_to_20;}
                if( (input) % 10 == 6) {result = result + n_16 + currency_5_to_20;}
                if( (input) % 10 == 7) {result = result + n_17 + currency_5_to_20;}
                if( (input) % 10 == 8) {result = result + n_18 + currency_5_to_20;}
                if( (input) % 10 == 9) {result = result + n_19 + currency_5_to_20;}
                
            }
            if( (input/10) % 10 == 1) {result += n_10;}
            if( (input/10) % 10 == 2) {result += n_20;}
            if( (input/10) % 10 == 3) {result += n_30;}
            if( (input/10) % 10 == 4) {result += n_40;}
            if( (input/10) % 10 == 5) {result += n_50;}
            if( (input/10) % 10 == 6) {result += n_60;}
            if( (input/10) % 10 == 7) {result += n_70;}
            if( (input/10) % 10 == 8) {result += n_80;}
            if( (input/10) % 10 == 9) {result += n_90;}

            if(  (input/10) % 10 != 1) {

            if( input % 10 == 0) {result += currency_5_to_20;}
            if( input % 10 == 1) {result = result + n_1 + currency_1;}
            if( input % 10 == 2) {result = result + n_2 + currency_2_to_4;}
            if( input % 10 == 3) {result = result + n_3 + currency_2_to_4;}
            if( input % 10 == 4) {result = result + n_4 + currency_2_to_4;}
            if( input % 10 == 5) {result = result + n_5 + currency_5_to_20;}
            if( input % 10 == 6) {result = result + n_6 + currency_5_to_20;}
            if( input % 10 == 7) {result = result + n_7 + currency_5_to_20;}
            if( input % 10 == 8) {result = result + n_8 + currency_5_to_20;}
            if( input % 10 == 9) {result = result + n_9 + currency_5_to_20;}
            }


            System.out.println(result);









        }
        else {
            System.out.println(incorrect_input);
            //in.nextLine();
            //input = 0;
            end = "";
            continue;
        }

    }
    catch (Exception ex) {
        System.out.println(incorrect_input);
        //in.nextLine();
        //input = 0;
        end = "";
        continue;
    }

    System.out.println(end_msg);
        end = in.next();
        //result = "";
        //input = 0;

}while(!end.equalsIgnoreCase("Q"));

    }
}









