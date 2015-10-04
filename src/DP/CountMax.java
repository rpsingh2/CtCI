/*
Given two integers ‘n’ and ‘sum’, find count of all n digit numbers with sum of digits as ‘sum’. Leading 0’s are not counted as digits.
1 <= n <= 100 and 1 <= sum <= 50000
 */
package DP;

/**
 *
 * @author Shubham
 */
public class CountMax {
    
    public static int cmax(int n, int sum){
        
        return 0;
    }
    public static void main(String args[]){
        int n=2;
        int sum=5;
        int output = cmax(n,sum);
        System.out.println("Maximum possible numbers are: " + output);
    }
}
