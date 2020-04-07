/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaf1954c2arithmetricdemo;

/**
 *
 * @author kevin yang（杨轩易）
 */
public class JavaF1954C2ArithmetricDemoClass2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //additon
        System.out.println(2 + 3);
        System.out.println(2 - 3);
        System.out.println(2 * 3);
        System.out.println(5 / 9 * (212 - 32));
        //INteger Division id divided by  an integer 
        System.out.println(10 / 3);//3.3333333
        System.out.println(10 % 5);
        System.out.println("Quarters\t"+(65/25));
        System.out.println("Dimes\t\t"+(65%25)/10);
        System.out.println("Dimes\t\t"+((65%25)%10)/5);
        System.out.println("Nickels\t\t"+((65%25)%10)/5);
        //Squaere Root
        System.out.println(Math.sqrt(16));
        //Type cast
        System.out.println((int)Math.sqrt(16));
        //pow
        System.out.println(Math.pow(2,3));
        //Absolute value
        System.out.println(Math.abs(-12));
        System.out.println(Math.sqrt(12));
        //Floor and ceil
        //floor will round up the number to nearst next Integer
        System.out.println(Math.floor(23.4));
        System.out.println(Math.floor(23.7));
        //ceil will round up the number to  the nes=ast Integer
        System.out.println(Math.ceil(23.4));
        System.out.println(Math.ceil(23.7));
        //Accesing Math Constant
          System.out.println(Math.PI);
          //find the area of the circle with radius 10 units
          System.out.println(Math.PI*Math.pow(10, 2));
          /**
           * Write a java expression that will convert the equation in the board
           **/                            
    }
}
