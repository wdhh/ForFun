package task1;


import java.util.Random;

public class Array {
    public static void main(String[] args) {
        int [] x = new int[12];
        Random random = new Random();
        for (int i = 0; i < x.length; i++) {
        x[i] = (int)(Math.random()*21)-10;
            System.out.println(x[i]);
        }
    }
}
