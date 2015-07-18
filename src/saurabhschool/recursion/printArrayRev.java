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
public class printArrayRev {
    public static void printARev(int size, int n[]){
        if(size==0){
            System.out.print(n[size]);
            return;
        }
        System.out.print(n[size]);
        printARev(size-1, n);
    }
    public static void main(String args[]){
        System.out.println("-----------------Printing the Reverse Array------------------");
        System.out.println("Enter the size of Array:");
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        if(size < 1){
            System.out.println("Please enter size greater than 1");
            System.exit(0);
        }
        int[] arr = new int[size];
        System.out.println("Enter the elements of Array:");
        for(int i=0;i<size;i++){
            Scanner s1 = new Scanner(System.in);
            arr[i] = s1.nextInt();
        }

        printARev(size-1, arr);
    }
}
