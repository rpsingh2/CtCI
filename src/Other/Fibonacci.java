/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Other;

import java.util.Scanner;

/**
 *
 * @author Shubham
 */
public class Fibonacci {
    
    public long fibDynamic(int n){
        long[] ar=new long[50];
        ar[0]=0;
        ar[1]=1;
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(ar[n]!=0){
            return ar[n];
        }
        ar[n]= fibDynamic(n-1)+fibDynamic(n-2);
        return ar[n];
    
    
    }
    
    
    public static void main(String args[]){
        System.out.println("Enter the range to find Fibonacci Number:");
        Scanner s= new Scanner(System.in);
        Fibonacci f= new Fibonacci();
        long start = System.nanoTime();
        long l= f.fibDynamic(s.nextInt());
        long end=System.nanoTime()-start;
        System.out.println("The number is:" + l);
        System.out.println("It took "+ end + " ns to finish the runtime.");
    }
}
