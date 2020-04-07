    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.f19.pkgclass.pkg10.hw;

/**
 *
 * @author kevin yang（杨轩易）
 */
import java.util.ArrayList; 
public class JavaF19Class10HW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    { 
  
        // creating an Empty Integer ArrayList 
        ArrayList<Integer> list = new ArrayList<Integer>(5); 
  
        // using add() to initialize values 
        list.add(1); 
        list.add(2); 
        list.add(3); 
        list.add(4); 
  
        // printing initial value ArrayList 
        System.out.print("ArrayList: " + list); 
  
        // find first element 
        int first = list.get(0); 
  
        // find last element 
        int last = list.get(list.size() - 1); 
  
        // print first and last element of ArrayList 
        System.out.println("\nFirst : " + first 
                           + ", Last : " + last); 
    } 
}