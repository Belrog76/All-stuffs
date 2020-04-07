/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trapezoid;

import java.util.Scanner;

/**
 *
 * @author kevin yang（杨轩易）
 */
public class Trapezoid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        //int stars = (n - 1) * 2 + m;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < (n-1)*2+m-i*2; j++) {
                System.out.print("*");
            }
            System.out.println();
            //stars -= 2;
        }

    }
}
