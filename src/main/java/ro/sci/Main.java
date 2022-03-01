package main.java.ro.sci;

import main.java.ro.sci.courses.course1.calculator.Calculator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Calculator calculator = new Calculator();

        double angle = 50;
        double result =  calculator.sin(angle)*calculator.sin(angle) +
                calculator.cos(angle)*calculator.cos(angle);

        System.out.println("Sin^2 + Cos^2 = " + result);

        double number1=235;
        double number2=13;
        System.out.println("Division: " + calculator.divide(number1, number2));

        System.out.println("Add or substract");
        System.out.println(calculator.addOrSubstract(number1, number2, "+"));
        System.out.println(calculator.addOrSubstract(number1, number2, "-"));

        for(int i=0;i<10;i++){
            System.out.println(i);
        }


//       System.out.println("For each element");
//        int[] numbers = {1,2,3,4,5};
//        for(int number: numbers){
//            System.out.println(number);
//        }

        System.out.println("Continue and break");
        int[] numbers = { 10, 20, 30, 40, 50 };
        int sum = 0;
        for (int x : numbers) {
            if (x == 30) {
                continue;
            }
            sum += x;
            if (sum > 100) {
                break;
            }
            System.out.print(x);
            System.out.print("\n");
        }
        System.out.print("sum: " + sum);
    }
}




