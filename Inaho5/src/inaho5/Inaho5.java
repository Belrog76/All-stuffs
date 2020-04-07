/* * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inaho5;

import java.util.Scanner;

/**
 *
 * @author kevin yang（杨轩易）
 */
public class Inaho5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        long sum = 0;
        long a;
        for (int i = 0; i < M; i++) {
            a = sc.nextLong();
            sum += -a;
        }
        if (sum != 0) {
            System.out.print("-");
        }
        System.out.println(sum);  
    }
}


