/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitmanipulation;

import java.util.Scanner;

/**
 *
 * @author Shubham
 */
public class isPowerOf2 {
    public boolean isPower(int number){
        if(number <=0){
            return false;
        }
        if((number & -number) == number)
            return true;
        else return false;
    }
    public static void main(String args[]){
        isPowerOf2 i = new isPowerOf2();
        System.out.println("Enter a number to check for power of 2");
        Scanner s= new Scanner(System.in);
        boolean b= i.isPower(s.nextInt());
        System.out.println("This number is power of 2:" + b);
    }
}
