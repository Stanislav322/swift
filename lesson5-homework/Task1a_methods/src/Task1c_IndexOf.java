/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stanislav
 */
public class Task1c_IndexOf {

    public static void main(String[] args) {
        int[]arr = {1,4,2};
       // indexOf(arr,5);
        System.out.println(indexOf(arr,4));

    }

    static int indexOf(int[] arr, int number) {
       
       for(int i=0;i<number;i++){
           if(arr[i]==number){
               return i;
           }
           
       } 
        return -1;
    }
}
