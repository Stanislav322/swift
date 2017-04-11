
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
public class Task4a_PrintSquare {
    
        public static void main(String[]args){
      
            Scanner scan = new Scanner(System.in);
            int m = scan.nextInt();
             
        for (int i = 1; i <= m; i++) {  
            for (int j = 1; j <= m; j++) {
                if (i == 1 || i == m)
                    System.out.print("* ");
                else if (j == 1 || j == m)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
}
}