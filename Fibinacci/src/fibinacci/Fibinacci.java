/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibinacci;

import java.util.Scanner;

/**
 *
 * @author kevin yang（杨轩易）
 */
public class Fibinacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Answer:"+factorial(n));
    }

    public static long factorial(int n) {
        if (n == 0 || n==1){
            return 1;
        } else {
            return factorial(n - 1) + factorial(n - 2);
        }
    }
}
