/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task1b_FindFunnyCharacters;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Stanislav
 */
public class Main {
    public static void main(String[]args){
        String input = "!@#$%^&*()_+-45=/\\3";
        String pattern = "\\W";
        printAllRegex(input,pattern);
    }
    
    
    private static void printAllRegex(String input,String patter){
        Pattern regex = Pattern.compile(patter);
        Matcher matcher = regex.matcher(input);
        
        while(matcher.find()){
            System.out.printf("Strange symbols are: %s%n",matcher.group());
        }
    }
}
