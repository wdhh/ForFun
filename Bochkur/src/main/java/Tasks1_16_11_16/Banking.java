package Tasks1_16_11_16;

/**
 Пользователь вводит число от 1 до 9999 (сумму выдачи в банкомате).
 Необходимо вывести на экран словами введенную сумму и в конце написать название валюты с правильным окончанием.
 Например: 7431 — семь тысяч четыреста тридцать один доллар, 2149 — две тысячи сто сорок девять долларов, 1
 5 — пятнадцать долларов, 3 — три доллара. 

 */

import java.util.Scanner;


public class Banking {

    public static String thaus="", hun="", ten="", teen="", min ="";
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер от 1 до 9999");
        int num = in.nextInt();




        if ((num / 1000) % 10 == 1) {thaus = "Одна тысяча ";}
        if ((num / 1000) % 10 == 2) {thaus = "Две тысячи ";}
        if ((num / 1000) % 10 == 3) {thaus = "Три тысячи ";}
        if ((num / 1000) % 10 == 4) {thaus = "Четыре тысячи ";}
        if ((num / 1000) % 10 == 5) {thaus = "Пять тысяч ";}
        if ((num / 1000) % 10 == 6) {thaus = "Шесть тысяч ";}
        if ((num / 1000) % 10 == 7) {thaus = "Семь тысяч ";}
        if ((num / 1000) % 10 == 8) {thaus = "Восемь тысяч ";}
        if ((num / 1000) % 10 == 9) {thaus = "Девять тысяч ";}

        if ((num / 100) % 10 == 2) {hun = "двести ";}
        if ((num / 100) % 10 == 3) {hun = "триста ";}
        if ((num / 100) % 10 == 4) {hun = "четыреста ";}
        if ((num / 100) % 10 == 5) {hun = "пятьсот ";}
        if ((num / 100) % 10 == 6) {hun = "шестьсот ";}
        if ((num / 100) % 10 == 7) {hun = "семьсот ";}
        if ((num / 100) % 10 == 8) {hun = "восемьсот ";}
        if ((num / 100) % 10 == 9) {hun = "девятьсот ";}

        if ((num / 10) % 10 == 1) {
            if (num % 10 == 0) {ten = "десять долларов";}
            if (num % 10 == 1) {ten = "одинадцать долларов";}
            if (num % 10 == 2) {ten = "двенадцать долларов";}
            if (num % 10 == 3) {ten = "тринадцать долларов";}
            if (num % 10 == 4) {ten = "четырнадцать долларов";}
            if (num % 10 == 5) {ten = "пятнадцать долларов";}
            if (num % 10 == 6) {ten = "шестнадцать долларов";}
            if (num % 10 == 7) {ten = "семнадцать долларов";}
            if (num % 10 == 8) {ten = "восемнадцать долларов";}
            if (num % 10 == 9) {ten = "девятнадцать долларов";}
        }

        if ((num / 10) % 10 == 2) {teen = "двадцать ";}
        if ((num / 10) % 10 == 3) {teen = "тридцать ";}
        if ((num / 10) % 10 == 4) {teen = "сорок ";}
        if ((num / 10) % 10 == 5) {teen = "пятьдесят ";}
        if ((num / 10) % 10 == 6) {teen = "шестьдесят ";}
        if ((num / 10) % 10 == 7) {teen = "семьдесят ";}
        if ((num / 10) % 10 == 8) {teen = "восемьдесят ";}
        if ((num / 10) % 10 == 9) {teen = "девяносто ";}

        if ((num / 10) % 10 != 1) {
                if (num % 10 == 0) {
                min = "долларов";
                }
                if (num % 10 == 1) {
                    min = "один доллар";
                }
                if (num % 10 == 2) {
                    min = "два доллара ";
                }
                if (num % 10 == 3) {
                    min = "три доллара ";
                }
                if (num % 10 == 4) {
                    min = "четыре доллара ";
                }
                if (num % 10 == 5) {
                    min = "пять долларов ";
                }
                if (num % 10 == 6) {
                    min = "шесть долларов ";
                }
                if (num % 10 == 7) {
                    min = "семь долларов ";
                }
                if (num % 10 == 8) {
                    min = "восемь долларов ";
                } else {
                    min = "девять долларов ";
                }


        }

//    }
//    public  static void thaus(int in){
//         if (in < 1000 && in > 999) {
//             System.out.println("тысяч");
//         }
//    }
//    public  static void hun(int in){
//        if (in < 1000 && in > 99){
//            System.out.println("сто");
//        }
//    }
//    public  static void ten(){
//        if (in < 100 && in > 9){
//            System.out.println("");
//        }
//    }
//    public  static void firstTen(int in){
//        if (in < 10 && in < 0){
//            switch (in) {
//                case 1:
//
//                default:
//        }
//            System.out.println("");
        System.out.print(thaus+hun+ten+teen+min);
    }

}

