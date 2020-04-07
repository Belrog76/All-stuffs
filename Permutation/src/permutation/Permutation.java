/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package permutation;

import java.util.Scanner;

/**
 *
 * @author kevin yang（杨轩易）
 */
public class Permutation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m =sc.nextInt();
        int p =1;
        for (int i=n;i>=n-m+1;i--){
            p*=i;
        }
        System.out.println(p);
    }    
}
