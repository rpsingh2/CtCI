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
