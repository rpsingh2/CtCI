/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DP;

import java.io.BufferedReader;

/**
 *
 * @author Shubham
 */
public class CoinChange {
    public static void change(int[] coins, int m, int n){
        if(m==0 || n==0){
            return;
        }
        int[] store= new int[n+1];
        store[0]=1;
        
        for(int i=0;i<m;i++)
            for(int j= coins[i];j<=n;j++)
                store[j]+=store[j-coins[i]];
        
        System.out.println("Number of Permutations of coin change is: " + store[n]);
    }
    public static void main(String args[]){
        int[] coins = {1,2,3};
        int value=4;
        change(coins,coins.length,value);       
    }
}
