/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stanislav
 */
public class Task2c_PrintMatrix {
    
    
      public static void main(String[]args){
          
          
      
    int n=4;
    int[][] arr = new int[n][n];
    
    int idx = 2;
    int i=0;
    int j=1;
 
   // while(true){
        while(j>=0){
            arr[i][j]=idx;
            idx++;
            i++;
            j--;
        }
        
        
        i++;
        j++;
    
       while(i>=0){
           arr[i][j]=idx;
           idx++;
           i--;
           j++;
           
           
           
}   
}
} 