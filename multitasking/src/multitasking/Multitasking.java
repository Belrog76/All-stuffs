/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multitasking;

import java.util.Scanner;

/**
 *
 * @author kevin yang（杨轩易）
 */
public class Multitasking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        char[] row1 = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'};
        char[] row2 = {'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'};
        char[] row3 = {'z', 'x', 'c', 'v', 'b', 'n', 'm'};
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String words = sc.nextLine();
            if (wordInRow(words, row1)) {
                sum += 1;
            }
            if (wordInRow(words, row2)) {
                sum += 1;
            }
            if (wordInRow(words, row3)) {
                sum += 1;
            }
        }
        System.out.println(sum);
    }

    private static boolean wordInRow(String words, char[] row1) {
        for (int i=0;i<words.length();i++){
            char c=words.charAt(i);
            if(!charInRow(c,row1)){
                return false;
            }
        }
        return true;
    }

    private static boolean charInRow(char c, char[] row1) {
       for (int j=0;j<row1.length;j++){
           char z=row1[j];
           if (z==c)
               return true;
       }
       return false;
       
    }
    
}

