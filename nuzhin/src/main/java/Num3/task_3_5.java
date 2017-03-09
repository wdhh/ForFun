package Num3;

import java.util.Scanner;

/**
 * Created by IVAN on 11/19/2016.
 */

/*
Создайте калькулятор, который выполняет, базовые арифметические операции:
 - умножение;
 - деление;
 - сложение;
 - вычитание;
 - остаток от деления ;
 - нахождение модуля числа.
Позьзователь вводит операцию о перанды
 */


public class task_3_5 {
    public static void main(String[] args) {




//msg
                String descr_L0 = "Для справки введите help, для начала работы - первый операнд";
                String descr_L1 = "Калькулятор умеет выполнять 6 действий:";
                String descr_L2 = "Для умножения введите первый операнд, затем *, затем второй операнд";
                String descr_L3 = "Для деления введите первый операнд, затем /, затем второй операнд";
                String descr_L4 = "Для сложения введите первый операнд, затем +, затем второй операнд";
                String descr_L5 = "Для вычитания введите первый операнд, затем -, затем второй операнд";
                String descr_L6 = "Для получения остатка от деления введите первый операнд, затем %, затем второй операнд";
                String descr_L7 = "Для получения модуля числа введите операнд, затем abs";
                String descr_L8 = "Вводимые числа могут быть дробными";
                String end_msg = "Нажмите 'Q' для выхода либо кнопку AnyKey для повтора";
                String incorrect_input = "Ошибка парсинга данных, давайте попробуем сначала";
                String divide_by_zero = "Деление на ноль не лучшая идея, давайте попробуем сначала";
                String exp_msg = "Ошибка; давайте попробуем сначала";
                String operator_msg = "введите оператор действия(+ - * / % abs)";
                String operand_2_msg = "Введите второй операнд";
//var
                String end = "";
                do {
                    System.out.println(descr_L0);
                    Scanner in = new Scanner(System.in);
                    String input ="";

                    try {
                        Double result = 0.0;
                        double operand_1 = 0.0;
                        double operand_2 = 0.0;
                        input = in.next();
                        in.nextLine();
                        String operator = "";
                        if (input.equalsIgnoreCase("help")) {
                            System.out.println(descr_L1 );
                            System.out.println(descr_L2 );
                            System.out.println(descr_L3 );
                            System.out.println(descr_L4 );
                            System.out.println(descr_L5 );
                            System.out.println(descr_L6 );
                            System.out.println(descr_L7 );
                            System.out.println(descr_L8 );
                            System.out.println(descr_L0 );
                        }else {
                             operand_1 = Double.parseDouble(input);
                        }

                        System.out.println(operator_msg );
                         operator = in.next();
                        in.nextLine();

                        if(!operator.equals("-") && !operator.equals("+") && !operator.equals("*") && !operator.equals("/") && !operator.equals("%")  && !operator.equalsIgnoreCase("abs")){
                            throw new NumberFormatException();
                        }

                        //math
                        if(operator.equalsIgnoreCase("abs")) {
                            result = Math.abs(operand_1);

                        } else {
                            System.out.println(operand_2_msg);
                            operand_2 = in.nextDouble();
                            in.nextLine();

                            if (operator.equalsIgnoreCase("-")) {
                                result = operand_1 - operand_2;
                            } else if (operator.equalsIgnoreCase("+")) {
                                result = operand_1 + operand_2;
                            } else if (operator.equalsIgnoreCase("*")) {
                                result = operand_1 * operand_2;
                            } else if (operator.equalsIgnoreCase("/")) {
                                result = operand_1 / operand_2;
                            } else if (operator.equalsIgnoreCase("%")) {
                                result = operand_1 % operand_2;
                            }
                        }


                        if(result % 1 ==0) {
                            System.out.println("Результат = " + result.intValue());
                        }else{
                            System.out.println("Результат = " + result);
                        }

                    }
                    catch (NumberFormatException ex) {
                        System.out.println(incorrect_input);
                        //in.nextLine();
                        continue;
                    }catch (ArithmeticException  ex){
                        System.out.println(divide_by_zero);
                        in.nextLine();
                    }
                        catch (Exception ex){
                            System.out.println(exp_msg);
                            in.nextLine();

                        }
                    System.out.println(end_msg);
                    end = in.next();

                }while(!end.equalsIgnoreCase("Q"));

            }
        }






