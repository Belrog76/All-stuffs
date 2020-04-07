/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tudor.gets.a.goat;

import java.util.Scanner;

/**
 *
 * @author kevin yang（杨轩易）
 */
public class TudorGetsAGoat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int p=sc.nextInt();
        if (n==m){
            System.out.println("Switch");            
        }else{
            System.out.println("Stay");
        }
    }
    
}
