/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task1_CalculatorClient;

/**
 *
 * @author Stanislav
 */
public class Calculator {

    float sumNumbers(float numberOne, float numberTwo) {
        return numberOne + numberTwo;
    }

    float subtractNumbers(float numberOne, float numberTwo) {
        return numberTwo - numberOne;
    }

    float multiplyNumbers(float numberOne, float numberTwo) {
        return numberOne * numberTwo;
    }

    float divideNumbers(float numberOne, float numberTwo) {
        return numberOne / numberTwo;

    }
    
    float percentageNumbers(float numberOne,float numberTwo){
        return numberTwo*(numberOne/100);
    }

}
