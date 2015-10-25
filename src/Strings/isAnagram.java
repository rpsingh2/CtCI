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
public class isAnagram {
    
    public static boolean isAna(String first, String second){
        if(first.length()!=second.length())
            return false;
        
        char[] c = first.toCharArray();
        StringBuilder sb = new StringBuilder(second);
        for(char ch: c){
            int index = sb.indexOf("" + ch);
            if(index != -1){
                sb.deleteCharAt(index);
            }
            else{
                return false;
            }
        }
        return sb.length()==0;
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter first String");
        String first = s.nextLine();
        System.out.println("Please Enter second String");
        String second = s.nextLine();
        
        if(isAna(first, second)){
            System.out.println("YES");
        }
        else
            System.out.println("NO");
    }
}
