/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task1a_FindIntegers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Stanislav
 */
public class Main {
     public static void main(String[]args){
     
    String input = "I have 3 cats and 5 dogs,but his money are -20";
    String pattern = "\\d";
    printAllRegex(input, pattern);
}

private static void printAllRegex(String input,String pattern){
   Pattern regex = Pattern.compile(pattern);
   Matcher matcher = regex.matcher(input);
  
    while(matcher.find()){
        System.out.printf("Number %s%n",
                    matcher.group());
        }
    }
    }
