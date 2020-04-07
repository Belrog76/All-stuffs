/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite.bag;

import java.util.Scanner;

/**
 *
 * @author kevin yang（杨轩易）
 */
public class CompositeBag {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=0;i<n;i++){
            int num=sc.nextInt(); 
            for(int j = 2; j <=Math.sqrt(num); j++){
                if(num % j == 0){
                sum+=1;
                break;
                }   
            } 
        }
           System.out.println(sum);
    }
}
