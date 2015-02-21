/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

import java.util.Scanner;

/**
 *A palindrome check for strings irrespective of spaces, symbols etc.
 * @author Shubham
 */
public class SimplePalindrome {
    
    public boolean isPalindrome(String str){
        str=str.toLowerCase();
	int n = str.length()-1;
	int i = 0;
	while(i<n){
            while(!Character.isLetter(str.charAt(i))){
		i++;
            }
            while(!Character.isLetter(str.charAt(n))){
		n--;
            }
            if(str.charAt(i) != str.charAt(n)){
		return false;
            }
            i++;
            n--;		
		}
        return true;
    }
    
    public static void main(String args[]){
        SimplePalindrome sp= new SimplePalindrome();
        System.out.println("Enter a String to check for Palindrome: ");
        Scanner s= new Scanner(System.in);
        boolean b = sp.isPalindrome(s.nextLine());
        if(b==true)
            System.out.println("The string is a palindrome.");
        else
            System.out.println("The string is not a palindrome.");
    }
}
