/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pink;

import java.util.Scanner;

/**
 *
 * @author kevin yang（杨轩易）
 */
public class Pink {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= c; i++) {
            int r = sc.nextInt();
            int g = sc.nextInt();
            int b = sc.nextInt();
            if (240 <= r && r <= 255 && 0 <= g && g <= 200 && 95 <= b && b <= 220) {
                sum+=1;
            }
        }
        System.out.println(sum);
    }
}
