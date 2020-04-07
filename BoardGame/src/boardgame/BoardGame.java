/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boardgame;

import java.util.Scanner;

/**
 *
 * @author kevin yang（杨轩易）
 */
public class BoardGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int numberOfLs = 0;
        int maxConsecutiveLs = 0;
        int numberOfConsecutiveLs = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'L') {
                numberOfLs++;
                numberOfConsecutiveLs++;
            } else if (c != ' ') {
                if (maxConsecutiveLs < numberOfConsecutiveLs) {
                    maxConsecutiveLs = numberOfConsecutiveLs;
                }
                numberOfConsecutiveLs = 0;
            }
        }
        if (maxConsecutiveLs < numberOfConsecutiveLs) {
            maxConsecutiveLs = numberOfConsecutiveLs;
        }
        System.out.println(numberOfLs + " " + maxConsecutiveLs);
    }
}
