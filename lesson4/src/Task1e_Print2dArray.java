
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
public class Task1e_Print2dArray {

    public static void main(String[] args) {

        int rowCount = 4;
        int colCount = 4;

        int[][] arr = new int[rowCount][colCount];
        int idx = 1;

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {

                arr[i][j] = idx;
                idx++;
                System.out.printf("%4d", arr[i][j]);
            }

            System.out.println("");

        }

    }
}
