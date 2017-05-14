/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task5_ChildPlay;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Stanislav
 */
public class Task5_ChildPlay {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List<Integer> childs = new ArrayList<>();
        int rounds = 0;
        
        for(int i =0;i<n;i++){
            int newChild = scan.nextInt();
            childs.add(newChild);
            if(childs.get(i)>childs.get(i-1)){
                rounds++;
            }
            
        }
       System.out.println(rounds);  

    }
}
