/*
Given an unsorted array, find the max length of subsequence in which the numbers are in incremental order. 

For example: If the input array is {7, 2, 3, 1, 5, 8, 9, 6}, a subsequence with the most numbers in incremental order is {2, 3, 5, 8, 9} and the expected output is 5.
 */
package DP;

import java.util.Scanner;

/**
 *
 * @author Shubham
 */
public class MaxSubsequence {
    
    public static int max_sub(int[] arr, int n){
        int[] temp = new int[n];
        for(int i=0;i<n;i++){
            temp[i] = 1;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(arr[i]>arr[j] && temp[i]<=temp[j])
                    temp[i]=temp[j]+1;
            }
        }
        int max=0;
        for(int i=0;i<n;i++){
            if(temp[i]>max)
                max=temp[i];
        }
        return max;
    }
    public static void main(String args[]){
        System.out.println("Enter the size of Array: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] input = new int[n];
        int i=0;
        System.out.println("Enter the Array elements: ");
        for(i=0;i<n;i++){
            input[i]=s.nextInt();
        }
        int ans = max_sub(input, n);
        System.out.println("Length of maximum subseqeunce is  "+ ans);
    }
}
