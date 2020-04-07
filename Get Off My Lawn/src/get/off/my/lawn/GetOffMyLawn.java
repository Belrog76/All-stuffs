/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package get.off.my.lawn;

import java.util.Scanner;

/**
 *
 * @author kevin yang（杨轩易）
 */
public class GetOffMyLawn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double maxnum = -1;
        int fnA=0;
        int fnB=0;
        for (int i = 0; i < num; i++) {
            double n = sc.nextDouble();
            double m = sc.nextDouble();
            double k = Math.sqrt(n * n + m * m);
                if (maxnum < k) {
                    maxnum = k;
                    fnA=(int)n;
                    fnB=(int)m;
                }    
            }
            System.out.println(fnA+" "+fnB);
        }     
    }

