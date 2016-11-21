package task1;


import java.util.Scanner;

public class ITM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount");
        int amount = scanner.nextInt();

        String [] oneNineteen = new String[19];
        oneNineteen[0] = "one";
        oneNineteen[1] = "two";
        oneNineteen[2] = "three";
        oneNineteen[3] = "four";
        oneNineteen[4] = "five";
        oneNineteen[5] = "six";
        oneNineteen[6] = "seven";
        oneNineteen[7] = "eight";
        oneNineteen[8] = "nine";
        oneNineteen[9] = "ten";
        oneNineteen[10] = "eleven";
        oneNineteen[11] = "twelve";
        oneNineteen[12] = "thirteen";
        oneNineteen[13] = "fourteen";
        oneNineteen[14] = "fifteen";
        oneNineteen[15] = "sixteen";
        oneNineteen[16] = "seventeen";
        oneNineteen[17] = "eightteen";
        oneNineteen[18] = "nineteen";
        String [] twentyNinety = new String[8];
        twentyNinety[0] = "twenty";
        twentyNinety[1] = "thirty";
        twentyNinety[2] = "fourty";
        twentyNinety[3] = "fifty";
        twentyNinety[4] = "sixty";
        twentyNinety[5] = "seventy";
        twentyNinety[6] = "eighty";
        twentyNinety[7] = "ninety";


        if ( amount > 1000){
            int rang1 = amount /1000;
            int rang2 = amount % 1000 /100;
            int rang3 = amount % 100 / 10;
            int rang4 = amount % 10;
            String rang11 = null;
            String rang22 = null;
            String rang33 = null;
            String rang44 = null;
            rang11 = oneNineteen[rang1-1];
            if (rang2!=0) rang22 = oneNineteen[rang2-1];
            if (rang3!=0 && rang3>=20){
                rang33 = twentyNinety[rang3-1];
                if (rang4!=0) rang44 = oneNineteen[rang4-1];
            }
            if (rang3<20) rang33 = oneNineteen[rang3-1];

            String total = rang11;
            if (rang22!=null) total = total + " " + rang22;
            if (rang33!=null) total = total + " " + rang33;
            if (rang44!=null) total = total + " " + rang44;

            System.out.println(total + " USD");
        }



    }
}

