/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rainbowrating;

import java.util.Scanner;

/**
 *
 * @author kevin yang（杨轩易）
 */
public class RainbowRating {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        for (int i = 0; i <= c; i++) {
            int s = sc.nextInt();
            if (s < 1000) {
                System.out.println("Newbie");
            } else if (s >= 1000 && s <= 1199) {
                System.out.println("Amateur");
            } else if (s > 1200 && s <= 1499) {
                System.out.println("Expert");
            } else if (s >= 1500 && s <= 1799) {
                System.out.println("Candidate Master");
            } else if (s >= 1800 && s <= 2199) {
                System.out.println("Master");
            } else if (s >= 1800 && s <= 2199) {
                System.out.println("Master");
            } else if (s >= 2200 && s <= 2999) {
                System.out.println("Grandmaster");
            } else if (s >= 2300 && s <= 3999) {
                System.out.println("Target");
            } else if (s >= 4000) {
                System.out.println("Rainbow Master");
            }
        }
    }
}
