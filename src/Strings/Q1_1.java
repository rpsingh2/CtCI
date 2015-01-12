/*
Implement a program to find whether all alphabets in String are unique or not.
 */
package Strings;

import java.util.Scanner;

/**
 *
 * @author Shubham
 */
public class Q1_1 {
    public boolean isUnique(String str){
        int i,j=0;
        for(i=0;i<str.length();i++)
            for(j=i+1;j<str.length();j++)
                if(str.charAt(i)==str.charAt(j))
                    return false;
        return true;
    }
    
    public static void main(String args[]){
        Q1_1 q=new Q1_1();
        System.out.println("Enter the String:");
        Scanner s= new Scanner(System.in);
        boolean result = q.isUnique(s.nextLine());
        System.out.println(result);
    }
}
