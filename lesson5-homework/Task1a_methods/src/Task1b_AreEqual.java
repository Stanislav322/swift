/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stanislav
 */
public class Task1b_AreEqual {
    
     public static void main(String[]args){
         areEqual(5,10);
         areEqual(5,5);
        System.out.println(areEqual(5,5));
     }
     
     
     static boolean areEqual(int a,int b){
         if(a==b){
           return true;
           
     }else{
            return  false;
         } 
     
}
}