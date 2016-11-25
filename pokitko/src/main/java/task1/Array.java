package task1;


import java.util.Random;

public class Array {
    public static void main(String[] args) {
        int[] x = new int[12];
        //int neg = 0;
        int pos = 0;
        Random random = new Random();
        for (int i = 0; i < x.length; i++) {
            {
                x[i] = random.nextInt(10) + 1;
                if (pos == x.length / 2) {
                    x[i] = -x[i];
                } else if ((x.length - i) > (x.length / 2 - pos)) {
                    int sgn = random.nextInt(2);
                    x[i] = x[i] * (int) Math.pow(-1, sgn);
                    pos += -sgn + 1;
                }
                System.out.println(x[i] + " ");
            }


        }
    }
}











//Random random = new Random();
//for (int i = 0; i < x.length; i++) {
//x[i] = (int)(Math.random()*21)-10;
//  System.out.println(x[i]);