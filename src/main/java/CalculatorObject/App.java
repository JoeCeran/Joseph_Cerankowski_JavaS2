package CalculatorObject;

import java.util.Scanner;

public class App {
    public static void main(String[] args){

        Scanner myScanner = new Scanner(System.in);

        CalculateObject calculator = new CalculateObject(1,1);
        System.out.println(calculator.getX() + " + " +  calculator.getY() + " = "+ calculator.addition());
        calculator = new CalculateObject(23,52);
        System.out.println(calculator.getX() + " - " +  calculator.getY() + " = "+ calculator.subtraction());
        calculator = new CalculateObject(34,2);
        System.out.println(calculator.getX() + " * " +  calculator.getY() + " = "+ calculator.multiplication());
        calculator = new CalculateObject(12,3);
        System.out.println(calculator.getX() + " / " +  calculator.getY() + " = "+ calculator.division());
        calculator = new CalculateObject(12,7);
        System.out.println(calculator.getX() + " / " +  calculator.getY() + " = "+ calculator.division());

        CalculateObject calculatorDouble = new CalculateObject(3.4, 2.3);
        System.out.println(calculatorDouble.getxD() + " + " +  calculatorDouble.getyD() + " = "+ calculatorDouble.additionDouble());
        calculatorDouble = new CalculateObject(6.7, 4.4);
        System.out.println(calculatorDouble.getxD() + " * " +  calculatorDouble.getyD() + " = "+ calculatorDouble.multiplicationDouble());
        calculatorDouble = new CalculateObject(5.5, 0.5);
        System.out.println(calculatorDouble.getxD() + " - " +  calculatorDouble.getyD() + " = "+ calculatorDouble.subtractionDouble());
        calculatorDouble = new CalculateObject(10.8, 2.2);
        System.out.println(calculatorDouble.getxD() + " / " +  calculatorDouble.getyD() + " = "+ calculatorDouble.divisionDouble());
    }
}
