/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saurabhschool.recursion;

import java.util.Scanner;

/**
 *
 * @author Shubham
 */
public class sumN {
    public static int sumNos(int n){
        if(n==1){
            return 1;
        }
        return(sumNos(n-1) + n);
    }
    public static void main(String args[]){
        System.out.println("-----------------Sum of first N natural numbers------------------");
        System.out.println("Enter the value of N:");
        Scanner s = new Scanner(System.in);
        int result = sumNos(s.nextInt());
        System.out.println("Sum is " + result);
    }
}
