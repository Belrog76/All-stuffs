/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minimun;

import java.util.Scanner;

/**
 *
 * @author kevin yang（杨轩易）
 */
public class Minimun {

    /**
     * @param args the command line arguments
     * @return
     */
     public static void main(String[] args) {
        int n, temp;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
