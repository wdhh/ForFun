package task1;


import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first operand");
        double operand1 = scanner.nextInt();
        System.out.println("Enter second operand");
        double operand2 = scanner.nextInt();
        System.out.println("Enter operation");
        String operation = scanner.next();
        double operand3 = 0;

        if (operation.equals("+")) operand3 = operand1 + operand2;
        if (operation.equals("-")) operand3 = operand1 - operand2;
        if (operation.equals("*")) operand3 = operand1 * operand2;
        if (operation.equals("%")) operand3 = operand1 % operand2;
        if (operation.equals("/")) operand3 = operand1 / operand2;
        if (operation.equals("||")) {
            if (operand1<0) operand1 = operand1 * -1;
            if (operand2<0) operand2 = operand2 * -1;
            System.out.println(operand1 + " " + operand2);
        }
        if (operand3 != 0){
            System.out.println(operand3);
        }




       /* double operand1 = 10;
        double operand2 = 3;
        double operand = 0;
        double operand3 = 6.5;
        String operation = "/";

        if (operation.equals("+")) operand = operand1 + operand2;
        if (operation.equals("-")) operand = operand1 - operand2;
        if (operation.equals("*")) operand = operand1 * operand2;
        if (operation.equals("%")) {
            operand = operand1 % operand2;
            //System.out.println(operand3);
        }


        if (operation.equals("/")){
            operand3 = operand1 / operand2;
            System.out.println(operand3);
        }
        if (operation.equals("||")) {
            if (operand1 >= 0) {
                operand = operand1;
            } else operand = operand1 * (-1);
        }
        System.out.println(operand);*/
    }
}










      /*  int operand3 = operand1 + operand2;
        System.out.println(operand3);

        operand3 = operand1 - operand2;
        System.out.println(operand3);

        operand3 = operand1 * operand2;
        System.out.println(operand3);

        operand3 = operand1 / operand2;
        System.out.println(operand3);

        if (operand1>=0){
            operand3 = operand1;

        }else operand3 = operand1 * (-1);
        System.out.println(operand3);

        double operand4 = operand1 % operand2;
        System.out.println(operand4); */



