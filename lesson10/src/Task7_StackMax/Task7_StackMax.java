/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task7_StackMax;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 *
 * @author Stanislav
 */
public class Task7_StackMax {
     public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        String command = "";
        Deque<Integer> stack = new ArrayDeque<>();

        while (!command.equals("end")) {

            String input = sc.nextLine();
            String[] split = input.toUpperCase().split(" ");

            command = split[0].trim();

            switch (command) {
                case "PUSH":
                    stack.add(Integer.parseInt(split[1].trim()));
                    break;
                case "POP":
                    int pop = stack.pop();
                    System.out.println(pop);
                    break;
                case "MAX":
                    int max = 0;
                    for (Integer integer : stack) {
                        if(integer > max){
                            max=integer;
                        }
                    }
                    System.out.println(max);
                    break;
                default:
                    
            }

        }
      
        
    }
}



