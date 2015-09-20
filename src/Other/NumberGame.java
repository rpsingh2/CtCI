/*
Code to check the head and tail of a number are same or not
 */
package Other;

import java.util.Scanner;

/**
 *
 * @author Shubham
 */
public class NumberGame {
    public static void main(String args[]){
        
        System.out.println("Enter the number to check the first and last number:");
        Scanner s= new Scanner(System.in);
        int input = s.nextInt();
        if(input<0){
            System.out.println("Number is less than zero");
            return;
        }
        if(input/10==0){
            System.out.println("Single Digit Number");
            return;
       }
        int tail=input%10;
        int temp=0;
        while(input!=0){
            temp = input%10;
            input=input/10;
        }
        if(temp==tail)
            System.out.println("True");
        else
            System.out.println("False");
        
}
}
