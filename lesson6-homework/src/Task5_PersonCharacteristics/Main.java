/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task5_PersonCharacteristics;

import java.util.Scanner;

/**
 *
 * @author Stanislav
 */
public class Main {
      public static void main(String[]args){
    
     Scanner scan = new Scanner(System.in);
     int number = scan.nextInt();
     Person[] person = new Person[number];
     
     for(int i=0;i<number;i++){
      String line = scan.nextLine();
      String[] split = line.split(";");
      
       person[i] = new Person(
             split[0],
             split[1],
             split[2].charAt(0),
             Integer.parseInt(split[3]),
             Integer.parseInt(split[4]),
             Float.parseFloat(split[5]),
             split[6],
             Double.parseDouble(split[7]),
             System.out.println(person[i].toString()));
    
}
     
    
    
}
}
