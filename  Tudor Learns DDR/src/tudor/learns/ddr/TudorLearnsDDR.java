/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tudor.learns.ddr;

import java.util.Scanner;

/**
 *
 * @author kevin yang（杨轩易）
 */
public class TudorLearnsDDR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String sequence = sc.nextLine();
        if (sequence.charAt(0) == sequence.charAt(1) || sequence.charAt(0) == sequence.charAt(2) || sequence.charAt(1) == sequence.charAt(2)) {
            System.out.println("Neither");
            return;
        }
        if (sequence.charAt(0) == 'U' && sequence.charAt(2) != 'D') {
            System.out.println("Neither");
            return;
        }
         if (sequence.charAt(0) == 'D' && sequence.charAt(2) != 'U') {
            System.out.println("Neither");
            return;
        }
         if (sequence.charAt(0) == 'L' && sequence.charAt(2) != 'R') {
            System.out.println("Neither");
            return;
        }
          if (sequence.charAt(0) == 'R' && sequence.charAt(2) != 'L') {
            System.out.println("Neither");
            return;
        }
         if (sequence.charAt(0) == 'L' || sequence.charAt(0) == 'R') {
            System.out.println("Crossover");
        }  else{
             System.out.println("Candle");
         }                    
    }
}
