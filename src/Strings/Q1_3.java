package Strings;

import java.util.Scanner;

/*
Given 2 Strings, write a method to decide if one is permutation of other.
package Strings;

/**
 *
 * @author Shubham
 */
public class Q1_3 {
    
    public Boolean stringPerm(String s1, String s2){
       return (s1.equals(s2));
          
    }
    
    public String sort(String s1){
        char[] str=s1.toCharArray();
        java.util.Arrays.sort(str);
        return new String(str);
    }
    
    
     public static void main(String args[]){
        Q1_3 q=new Q1_3();
        System.out.println("Enter the String:");
        Scanner s= new Scanner(System.in);
        String s2=q.sort(s.nextLine());
    
        System.out.println("Enter Another String:");
        Scanner s1= new Scanner(System.in);
        String s3=q.sort(s1.nextLine());
 
        Boolean result = q.stringPerm(s2,s3);
        System.out.println(result);
    }
}
