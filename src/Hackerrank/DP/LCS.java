/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hackerrank.DP;
import java.util.Scanner;

/**
 * @author sbhawsin
 */

public class LCS {
    public static int lcs(String s1, String s2){
        int n = s1.length();
        int m=s2.length();
        if(n==0 || m==0)
            return 0;
        int[][] store = new int[n+1][m+1];
        
        for(int j=0;j<=m;j++)
            store[0][j]=0;
        for(int i=0;i<=n;i++)
            store[i][0]=0;
        
        for(int i=1;i<=n;i++)
            for(int j=1;j<=m;j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                store[i][j] = store[i-1][j-1] + 1;
                }
                else{
                    store[i][j] = Math.max(store[i-1][j], store[i][j-1]);
                }
            }
        return store[n][m];
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        String s2 = s.nextLine();
        int output = lcs(s1,s2);
        
        System.out.println(output); 
    }
}
