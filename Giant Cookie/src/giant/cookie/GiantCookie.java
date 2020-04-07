/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giant.cookie;

import java.util.Scanner;

/**
 *
 * @author kevin yang（杨轩易）
 */
public class GiantCookie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        if (N % M != 0) {
            System.out.println("no " + getadditionalpeople(N, M));
        } else {
            System.out.println("yes" + " " + (N / M));
        }
    }

    private static int getadditionalpeople(int N, int M) {
        int i = 1;
        while (true) {
            if (N %(M + i) == 0) {
                break;
            } 
            i++;
        }
        return i;
    }      
}