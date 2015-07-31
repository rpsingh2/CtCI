/*
Imagine you have a special keyboard with the following keys: 
Key 1:  Prints 'A' on screen
Key 2: (Ctrl-A): Select screen
Key 3: (Ctrl-C): Copy selection to buffer
Key 4: (Ctrl-V): Print buffer on screen appending it
                 after what has already been printed. 

If you can only press the keyboard for N times (with the above four
keys), write a program to produce maximum numbers of A's. That is to
say, the input parameter is N (No. of keys that you can press), the 
output is M (No. of As that you can produce).
 */
package DP;

import java.util.Scanner;

/**
 *
 * @author sbhawsin
 */
public class MaxNumberA {
    
    public static int maxnum(int n){
        int[] maxNum = new int[n];
        if(n<=6){
            return n;
        }
        for(int i=0;i<6;i++){
            maxNum[i]=i+1;
        }
        //initialization
        for(int i=7;i<=n;i++){
            maxNum[i-1]=0;
            
            for(int b=n-3;b>=1;b--){
                int curr = (n-b-1)*maxNum[b-1];
                if(curr>maxNum[n-1])
                    maxNum[n-1]=curr;
            }
        }
        return maxNum[n-1];
    }
    
    
    public static void main(String args[]){
        System.out.println("Enter the number of hits: ");
        Scanner s = new Scanner(System.in);
        int ans = maxnum(s.nextInt());
        System.out.println("The Maximum A's are: " + ans);
    }
}
