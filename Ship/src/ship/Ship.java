/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ship;

import java.util.Scanner;

/**
 *
 * @author kevin yang（杨轩易）
 */
public class Ship {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        char[] ar = new char[5];
        ar[0] = 'B';
        ar[1] = 'F';
        ar[2] = 'T';
        ar[3] = 'L';
        ar[4] = 'C';
        String s = sc.next();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            for (int j = 0; j < 5; j++) {
                if (ar[j] == c) {
                    ar[j] = '-';
                }
            }
        }
        boolean printed=false;
        for (int i = 0; i < 5; i++) {
            if (ar[i] != '-') {
                System.out.print(ar[i]);
                printed=true;
            } 

        }
        
        if (!printed) {
            System.out.print("NO MISSING PARTS");
        }
    }
}
