/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

import java.util.Scanner;

/**
 *
 * @author Shubham
 */
public class StringPermutation {
  static int count=0; 
    public void permu(String[] s, int k, int n){
        String temp;
        if(k==n){
            StringBuilder result = new StringBuilder();
            for (String item : s) {
                result.append(item);
            }
            String mynewstring = result.toString();
            count++;
            System.out.println(mynewstring); 
        }
        
        else{
            for(int i=k; i<n;i++){
                temp=s[k];
                s[k]=s[i];
                s[i]=temp;
                permu(s,k+1,n);
                temp=s[k];
                s[k]=s[i];
                s[i]=temp;
            }
        }
    }
    
    public static void main(String args[]){
        StringPermutation p= new StringPermutation();
        String[] s= new String[10];
        System.out.println("Enter the String :");
        Scanner s1=new Scanner(System.in);
        s = s1.nextLine().split("");
        int n=s.length;
        p.permu(s,0,n);
        System.out.println(count);
    }
}
