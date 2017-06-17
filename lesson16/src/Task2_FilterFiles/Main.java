/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task2_FilterFiles;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author Stanislav
 */
public class Main {
    public static void main(String[]args){
         Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String res = "";
        for (int i = 0; i <= n; i++) {
            String inp = sc.nextLine();

            if (Pattern.matches(".*\\.(jpg|gif|png)\\s*$", inp.toLowerCase().subSequence(0, inp.length()))) {
                res += inp + "\n";
            }
        }
        System.out.printf("-------------%nImage files:%n%s",res);
    }
}
    

