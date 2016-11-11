package Tasks1_16_11_16;

/**
 Создайте калькулятор, который выполняет, базовые арифметические операции:
 - умножение;
 - деление;
 - сложение;
 - вычитание;
 - остаток от деления ;
 - нахождение модуля числа.
 Позьзователь вводит операцию о перанды

 */
import java.util.Scanner;

public class Calkulator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num1, num2;
        char operator;
        int failed=0;

        System.out.println("Enter num1: ");
        num1=input.nextInt();
        System.out.println("Enter num2: ");
        num2=input.nextInt();
        System.out.println("Enter\"+,-,*,/,%,m: ");
        operator=input.next().charAt(0);

        do
        {
            failed=0;
            switch(operator) {
                case '+':
                {   add(num1, num2);
                    break;
                }
                case '-':
                {
                    subtract(num1, num2);
                    break;
                }
                case '*':
                {
                    multiply(num1, num2);
                    break;
                }
                case '/': {

                    divide(num1, num2);
                    break;
                }
                case '%': {
                    abs(num1, num2);
                    break;
                }
                case 'm': {
                    m(num1);
                    break;
                }
                default: {
                    System.out.println("wrong entered");
                    failed=1;
                }
                if(failed==1) {
                    System.out.println("Enter the operator\"+,-,*,/,|,%: ");
                    operator=input.next().charAt(0);
                }
            }
        }while(failed==1);
    }

    public static void add(int num1, int num2) {
        System.out.println("Sum is: "+num1+num2);
    }
    public static void subtract(int num1, int num2) {
        System.out.println("Diff is: "+(num1-num2));
    }
    public static void multiply(int num1, int num2) {System.out.println("Product is: "+(num1*num2));}
    public static void divide(int num1, int num2) {
        System.out.println("Quotient is: "+(num1/num2));
    }
    public static void abs(int num1, int num2) {
        System.out.println("% is: "+(num1%num2));
    }
    public static void m(int num1) {
        System.out.println("mod num1 is: " + Math.abs( num1));
    }
}
