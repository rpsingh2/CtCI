/*
Checking if any anagram of a given string is palindrome or not?
 */
package Strings;

import java.util.Scanner;

/**
 *
 * @author Shubham
 */
public class AnagramPalindrome {
    public static boolean palin(String str){
        int[] arr=new int[26];
        
        for(int i=0; i<str.length();i++){
            char ch=str.charAt(i);
            arr[ch-'a']++;
        }
        int flag= 0;
        for(int i=0;i<arr.length;i++){
            if(flag>1) return false;
            if(arr[i]%2==1)
                flag++;
        }
        return true;
    }
    
    
    public static void main(String args[]){
        System.out.print("Enter String to check for Anagramic Palindrome: ");
        Scanner s =new Scanner(System.in);
        if(palin(s.nextLine()))
            System.out.println("Yes");
        else
            System.out.println("No");
       
    }
}
