





/*
*Given a distance ‘dist, count total number of ways to cover the distance with 1, 2 and 3 steps.
 */
package DP;

import java.util.Scanner;

/**
 *
 * @author Shubham
 */
public class NumberOfSteps {
    public static void stepnum(int input){
        if(input <= 0)
            return;
        int[] arr = new int[input];
        arr[0]=1;arr[1]=1;arr[2]=2;
        for(int i=3;i<input;i++){
            arr[i]=arr[i-1] + arr[i-2] + arr[i-3];
        }
        System.out.println(arr[input-1]);
        
    }
    
    
    public static void main(String args[]){
        System.out.println("Enter the total distance");
        Scanner s=new Scanner(System.in);
        int input=s.nextInt();
        stepnum(input);
    }
}
