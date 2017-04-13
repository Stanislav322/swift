
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stanislav
 */
public class Main {
      
      public static void main(String[]args){
          
          Scanner sc = new Scanner(System.in);
          int number = sc.nextInt();
          Person[] person = new Person[number];
          
          for(int i = 0;i<number;i++){
              
             String line = sc.nextLine();
            String[] split = line.split(",");
            
            person[i] = new Person(
             split[0],
             split[1],
             split[2].charAt(0),
             Integer.parseInt(split[3]),
             Float.parseFloat(split[4]),
             Float.parseFloat(split[5]),
             split[6],
             Double.parseDouble(split[7]),
             System.out.print(Arrays.toString(person)));
             
            
          }
          
      }
    
}
