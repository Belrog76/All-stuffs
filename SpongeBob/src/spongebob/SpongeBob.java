/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spongebob;

import java.util.Scanner;

/**
 *
 * @author kevin yang（杨轩易）
 */
public class SpongeBob {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String newline = "";
            String line = sc.nextLine();
            boolean lowercase = true;
            for (int j = 0; j < line.length(); j++) {
                char c = line.charAt(j);
                if (Character.isAlphabetic(c)) {
                    if (lowercase) {
                        newline += Character.toLowerCase(c);
                    } else {
                        newline += Character.toUpperCase(c);
                    }
                    lowercase=!lowercase;
                }
                else{
                    newline+=c;
                }
            }
            System.out.println(newline);
        }
    }
}
