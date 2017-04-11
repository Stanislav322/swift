
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
public class Task4b_PrintZFigure {
    
        public static void main(String[]args){
              Scanner scan = new Scanner(System.in);
             int n  =scan.nextInt();
            
            for(int i=0;i<n;i++){
                System.out.print("* ");
            }
            System.out.println();
            
            for(int row=2;row<n;row++){
            for(int col=0;col<n-row;col++){
                System.out.print("  ");
            }
            System.out.println("* ");
        }
            
            for(int i=0;i<n;i++){
                System.out.print("* ");
            }
            System.out.println();
            
            
            
            
            
        }
}
