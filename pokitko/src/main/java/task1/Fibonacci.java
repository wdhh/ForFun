package task1;

public class Fibonacci {
    public static void main(String[] args) {
        int result = fibonacci(5);
        System.out.println(result);
    }

    public static int fibonacci(int n){
      if ( n==1 || n==2){
          return 1;
      }

      return fibonacci(n-1)+fibonacci(n-2);
    }


}
