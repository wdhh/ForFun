package task1;


import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scanner.nextInt();
        int result = fibonacci(n);
        System.out.println(result);
    }

    public static int fibonacci(int n){
      if ( n==1 || n==2){
          return 1;
      }

      return fibonacci(n-1)+fibonacci(n-2);
    }


}
