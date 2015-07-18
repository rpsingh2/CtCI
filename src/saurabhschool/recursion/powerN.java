/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saurabhschool.recursion;

import java.util.Scanner;
import static saurabhschool.recursion.sumOfDigits.sumD;

/**
 *
 * @author Shubham
 */
public class powerN {
    public static int power(int num, int pow){
        if(pow==1){
            return num;
        }
        int temp = power(num, pow/2);
        if(pow%2 == 0){
                
            return(temp*temp);
        }
        else
            return(num*temp*temp);
    }
    
    public static void main(String args[]){
        System.out.println("-----------------Power of Number in log(N) time------------------");
        System.out.println("Enter the Number:");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.println("Enter the Power:");
        Scanner s1 = new Scanner(System.in);
        int pow = s1.nextInt();
        int result = power(num,pow);
        System.out.println("Result is : " + result);
    }
}
