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
public class HomeworkClass2 {
 
public static void main(String[] args) {   
    //1. Area of a Circle
    //Find the area of a circle with a radius of 15 cm. Display the answer in sentence form.
    System.out.println("The area of Circule is" +(Math.PI*Math.pow(15,2))); 
    //2. Wayne Gretzky 
    //Create a program that stores the string "Wayne Gretzky" in a string memory location and stores 99
    //in a numeric memory location. The program should display: Wayne Gretzky is number 99 from the
    //memory locations
    System.out.println("The area of Circule is Wayne Gretzky is number 99 from the memory locations."); 
//3. Area of a Rectangle 
//  Find the area of a 5.7 by 4.8 rectangle. Have your program display the width, length, and area all on separate lines
        System.out.println("length\t"+5.7);
        System.out.println("Width\t\t"+4.8);
        System.out.println("Area\t\t"+5.7*4.8);
       // 4. Net Pay
//Find the net pay (n) for an employee who works 40 hours (h) at 5.00 per hour (w) and has 2.00 (i)
//deducted for insurance and must pay 22% for tax (t). Display your answer in sentence form and use
//the following formula: n=(h*w-i)-t*(h*w-i).
    System.out.println("Pay is \t\t"+((40*5.00-2.00)-0.22*(40*5.00-2.00)));
//5. Carpet
//Find the cost to carpet a room 8.5 m by 6 m if the carpet has a price of 19.95 per square meter.
//Display the answer in sentence form and use memory location variables that are appropriate for the
//items you are storing in memory.
    System.out.println("Cost is \t"+(8.5*6*19.95));
//6. Bill of sale
//Write a Java program to calculate and print a bill of sale based on the following:
//• A shirt was purchased for $12.49 and was paid with a $20 bill.
//• Assign variables for the purchase price and amount given to the clerk.
//• Calculate taxes, (HST = 13%), total bill, and change.
//• Output the entire bill showing purchased price, taxes, total, and change.
    
    
    double dblshirt =12.59;
    int intpaid = 20;
    double dblsalestax =dblshirt*0.13;
    double dblsubtotal=dblshirt + dblsalestax;
    double dblchange = intpaid - dblsubtotal;
    //if you want to use variable in your programe to istore informnation 
    //step 1 ; you need to declare the type of varibale
    //integer ->to store whole number 
    //double -> to  store real numbers 
    //printing the bill
    System.out.println("Purchased Price "+"\t"+ dblshirt);
    System.out.println("Amount paid "+"\t"+ intpaid);
     System.out.println("sub total"+"\t" +dblsubtotal);
     System.out.println("change "+"\t\t" +dblchange);
}


}