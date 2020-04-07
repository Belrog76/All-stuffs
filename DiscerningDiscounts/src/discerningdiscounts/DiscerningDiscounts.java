/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discerningdiscounts;

import java.util.Scanner;

/**
 *
 * @author kevin yang（杨轩易）
 */
public class DiscerningDiscounts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long listPrice;
        long discount;
        long discountPrice;
        int N;
        long T;
        int g=0;
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        T = scan.nextLong()*100;
        for (int i = 0; i <N; i++) {
            listPrice = scan.nextInt();
            discount = scan.nextInt();
            discountPrice = listPrice*(100-discount) ;
            if (discountPrice<=T)
                g=g+1;
        }
        System.out.println(g);
    }
}
