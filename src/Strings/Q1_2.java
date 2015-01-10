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
public class Q1_2 {
    public String reverse(String str){
        int i,j;
        j=str.length()-1;
        for(i=0;i<=j;i++){
            char temp;
            temp=str.charAt(i);
            str.replace(str.charAt(i), str.charAt(j));
            str.replace(str.charAt(j), temp); 
            j--;
     
            System.out.println(str);
        }
        return str;
    }
    
    public static void main(String args[]){
        Q1_2 q=new Q1_2();
        System.out.println("Enter the String:");
        Scanner s= new Scanner(System.in);
        String result = q.reverse(s.nextLine());
        System.out.println(result);
    }
}
