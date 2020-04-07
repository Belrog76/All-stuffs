/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package globex.cup.pkg18.j1.rounding.errors;

import java.util.Scanner;

/**
 *
 * @author kevin yang（杨轩易）
 */
public class GlobeXCup18J1RoundingErrors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int s = 0;
        int r = 0;
        for (int i = 0; i < num; i++) {
           double n = sc.nextDouble();
            if (n - (int) n >= 0.5) {
                r += 1;
            } else {
                s += 1;
            }
        }
        System.out.println(r);
        System.out.println(s);
    }
}
