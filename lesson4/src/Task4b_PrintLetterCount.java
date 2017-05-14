
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
public class Task4b_PrintLetterCount {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        int[] counters = new int[26];

        for (int i = 0; i < text.length(); i++) {

            char c = text.charAt(i);
            counters[c - 'a']++;

        }

        for (int i = 0; i < counters.length; i++) {

            if (counters[i] != 0) {
                System.out.println((char) (i + 'a') + " - " + counters[i]);
            }
        }

    }

}
