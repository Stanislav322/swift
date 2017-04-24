/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task1_CalculatorClient;

import java.util.Scanner;

/**
 *
 * @author Stanislav
 */
public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        String opr = "";

        while (!opr.equals("END")) {
            String input = sc.nextLine();
            String[] split = input.split(" ");

            String operation = split[0].trim();
            if(operation.equals("END")){
                break;
            }
            float numberOne = Float.parseFloat(split[1].trim());
            float numberTwo = Float.parseFloat(split[2].trim());

            Calculator newCalculation = new Calculator();
            float result = 0;
            switch (operation) {
                case "SUM":
                    result = newCalculation.sumNumbers(numberOne, numberTwo);
                    break;
                case "MUL":
                    result = newCalculation.multiplyNumbers(numberOne, numberTwo);
                    break;
                case "SUB":
                    result = newCalculation.subtractNumbers(numberOne, numberTwo);
                    break;
                case "DIV":
                    result = newCalculation.divideNumbers(numberOne, numberTwo);
                    break;
                case "PER":
                    result = newCalculation.percentageNumbers(numberOne, numberTwo);
                    break;
            }
            System.out.printf("%.3f",result);
            System.out.println("");
        }
        
    }
    
}
