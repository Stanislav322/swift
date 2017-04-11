
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
public class Task3b_PrintSumOfN {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        int sum = 0;

        for (int i = 0; i < number; i++) {
            int number1 = scan.nextInt();
            /////   if(number1!=0){
            //     System.out.println("is equal");
            //   }
            sum += number1;

        }
        System.out.println("sum is " + sum);

    }

}
