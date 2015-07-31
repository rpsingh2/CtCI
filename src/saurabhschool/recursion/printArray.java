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
public class printArray {
    public static void printA(int size, int curr, int n[]){
        if(curr==size-1){
            System.out.print(n[size-1]);
            return;
        }
        System.out.print(n[curr]);
        printA(size, curr+1, n);
    }
    public static void main(String args[]){
        System.out.println("-----------------Printing the Array------------------");
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

        printA(size, 0, arr);
    }
}
