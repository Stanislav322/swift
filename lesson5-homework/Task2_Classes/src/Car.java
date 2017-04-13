/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stanislav
 */
public class Car {
    String brand;
    String model;
    int age;
    int horsePower;
    int productionYear;
    
    
    
     Car(String brand, String model, int productionYear, int horsePower) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.horsePower = horsePower;
        this.age = 2017 - this.productionYear;
    }

    int insuranceCategory() {
        if (age < 8) {
            return 1;
        } else if (age >= 8 && age <= 15) {
            return 2;
        } else if (age > 15 && age < 25) {
            return 3;
        } else {
            return 4;
        }
    }

    double tax() {
        int sum = 0;
        double finalSum;
        int insuranceCat = insuranceCategory();
        if (insuranceCat == 1) {
            sum = 150;
        } else if (insuranceCat == 2) {
            sum = 200;
        } else if (insuranceCat == 3) {
            sum = 300;
        } else if (insuranceCat == 4) {
            sum = 500;
        }
        if (this.horsePower < 80) {
            finalSum = sum * 1.2;
        } else if (this.horsePower > 140) {
            finalSum = sum * 1.45;
        } else {
            finalSum = sum;
        }
        return finalSum;
}
}