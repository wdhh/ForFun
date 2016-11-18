/**
 *Напишите функцию fib(n), которая по данному целому неотрицательному n возвращает n-e число Фибоначчи.
 * В этой задаче нельзя использовать циклы — используйте рекурсию.
 */
public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        System.out.print(fib(n));

    }
    static int fib(int i) {
        if (i == 0) return 0;
        if (i == 1) return 1;
        return fib(i - 1) + fib(i - 2);
    }
}

