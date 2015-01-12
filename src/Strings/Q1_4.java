/*
Write a Program to replace space character in string by %20.
 */
package Strings;

import java.util.Scanner;

/**
 *
 * @author Shubham
 */
public class Q1_4 {
    
    public StringBuilder replaceSpace(String str){
        StringBuilder s1= new StringBuilder(str);
        char[] c= str.toCharArray();
        for(int i=0;i<str.length();i++){
            if((int)str.charAt(i)==32)
                s1.setCharAt(i,'%');
        }
    return s1;
    }
    
    
    
     public static void main(String args[]){
        Q1_4 q=new Q1_4();
        System.out.println("Enter the String:");
        Scanner s= new Scanner(System.in);
        String str= s.nextLine();
        StringBuilder result = q.replaceSpace(str);
        System.out.println(result);
    }
}
