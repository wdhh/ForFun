package Task4; /**
 * Пользователь вводит число от 1 до 9999 (сумму выдачи в банкомате).
 * Необходимо вывести на экран словами введенную сумму и в конце написать название валюты
 * с правильным окончанием. Например: 7431 — семь тысяч четыреста тридцать один доллар,
 * 2149 — две тысячи сто сорок девять долларов, 15 — пятнадцать долларов, 3 — три доллара. 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.util.Scanner;

public class Task4Bankomat {
    public final static String x1 = "один";
    public final static String xx1 = "одна";

    public final static String x2 = "два";
    public final static String xx2 = "две";
    public final static String x3 = "три";
    public final static String x4 = "четыре";
    public final static String x5 = "пять";
    public final static String x6 = "шесть";
    public final static String x7 = "семь";
    public final static String x8 = "восемь";
    public final static String x9 = "девять";
    public final static String x10 = "десять";
    public final static String x11 = "одинадцать";
    public final static String x12 = "двенадцать";
    public final static String x13 = "тринадцать";
    public final static String x14 = "четырнадцать";
    public final static String x15 = "пятнадцать";
    public final static String x16 = "шеснадцать";
    public final static String x17 = "сернадцать";
    public final static String x18 = "восемнадцать";
    public final static String x19 = "девятнадцать";

    public final static String x20 = "двадцать";
    public final static String x30 = "тридцать";
    public final static String x40 = "сорок";
    public final static String x50 = "пятдесят";
    public final static String x60 = "шесдесят";
    public final static String x70 = "семдесят";
    public final static String x80 = "восемдесят";
    public final static String x90 = "девяноста";

    public final static String x100 = "сто";
    public final static String x200 = "двести";
    public final static String x300 = "триста";
    public final static String x400 = "четыреста";
    public final static String x500 = "пятсот";
    public final static String x600 = "шестсот";
    public final static String x700 = "семсот";
    public final static String x800 = "восемсот";

    public final static String x1000 = "тысяча";
    public final static String xx1000 = "тысячи";
    public final static String xхx1000 = "тысяч";

    public static String convert(int x){
        String no = String.valueOf(x);
        String res = "";
        Field field;
        try{
            Class class_object = Task4Bankomat.class;

            if(no.charAt(no.length() - 1) != '0'){
                field = Task4Bankomat.class.getField("x" + no.charAt(no.length() - 1));
                res = " " + field.get(class_object).toString();
            }

            if(no.length() - 2 > -1 && no.charAt(no.length() - 2) == '1'){
                field = Task4Bankomat.class.getField("x1" + no.charAt(no.length() - 1));
                res = " "+ field.get(class_object).toString();
            }

            if(x > 19 && no.charAt(no.length() - 1) == '0'){
                field = Task4Bankomat.class.getField("x" + no.charAt(no.length() - 2) + "0");
                res = " " + field.get(class_object).toString() + res;
            }

            if(x>99 && no.charAt(no.length() - 3)!= '0'){
                field = Task4Bankomat.class.getField("x" + no.charAt(no.length() - 3) + "00");
                res = " " + field.get(class_object).toString() + res;
            }

            if(x > 999 && no.length() - 5 == -1){
                String isRes = no.charAt(no.length() - 4) + "";
                if(isRes.equals("1")){
                    field = Task4Bankomat.class.getField("xx" + no.charAt(no.length() - 4));
                    res = " " +field.get(class_object).toString()+ " " + x1000 + res;
                }
                if(isRes.equals("2")){
                    field = Task4Bankomat.class.getField("xx" + no.charAt(no.length() - 4));
                    res = " " +field.get(class_object).toString() + " " + xx1000 +res;
                }
                if(isRes.equals("3")|| isRes.equals("4")){
                    field = Task4Bankomat.class.getField("x" + no.charAt(no.length() - 4));
                    res = " " + field.get(class_object).toString() + " " + xx1000 + res;

                }
                if(no.charAt(no.length() - 4)!='0' && !isRes.equals("1") && !isRes.equals("2") && !isRes.equals("3") && !isRes.equals("4")){
                    field = Task4Bankomat.class.getField("x" + no.charAt(no.length() - 4));
                    res = " "+field.get(class_object).toString() + " " + xхx1000 + res;
                }
            }

            if(x > 9999 && no.charAt(no.length()-5) == '1'){
                field = Task4Bankomat.class.getField("x1" +no.charAt(no.length()-4));
                res = " " + field.get(class_object).toString() + " " + xхx1000 + res;
            }

            if(x > 19999){

                field = Task4Bankomat.class.getField("x" + no.charAt(no.length() - 5) + "0");
                if(no.charAt(no.length() - 4) == '0')
                    res = " " + field.get(class_object).toString() + " " + xхx1000 + res;
                else
                    res = " " +field.get(class_object).toString() + res;

            }
        }
        catch(Exception e){
           e.printStackTrace();
        }

        return res;
    }

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number");
        int x = scanner.nextInt();
        String text = convert(x);
        System.out.println("Your number = " + text);
    }

}



