/*
Checking if any anagram of a given string is palindrome or not?
 */
package Strings;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Shubham
 */
public class AnagramPalindrome {
    public static void palin(String str){
        int[] arr=new int[26];
        
        for(int i=0; i<str.length();i++){
            char ch=str.charAt(i);
            arr[ch-'a']++;
        }
        int[] temp = new int[100];
        int nm=0;
        int flag= 0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]%2==0 && arr[j]!=0){
                temp[nm]=arr[j]/2;
                nm++;    
            }
            else if(arr[j]%2==1 && arr[j]!=0){
                temp[nm]=(arr[j]-1)/2;
                nm++;
                flag++;
        }
        }
        int ans = recur(temp);

        if(flag!=0)
        System.out.println(flag-1 + "," + ans);
        else
            System.out.println(0 + "," + ans);
    }
    
    public static int recur(int[] arr){
        int count =0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]>0){
                count=count + arr[i];
            }                
        }
        int f = fact(count);
        for(int i=0; i<arr.length;i++){
            if(arr[i]>0){
                f=f/fact(arr[i]);
            }                
        }
        return f;
    }
    
    public static int fact(int n){
        int k=1;
        for(int i=n;i>0;i--){
            k = k*i;
        }
        return k;
    }
     
    public static void main(String args[]) throws FileNotFoundException, IOException{
        BufferedReader br = new BufferedReader(new FileReader("1.txt"));
        String line = null;
        while ((line = br.readLine()) != null) {
        palin(line);
        }
        System.out.println();
    }
}
