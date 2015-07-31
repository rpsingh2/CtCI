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
public class ReverStr {
    public String recursStr(String str){
        if(str.length() < 2){
            return str;
        }
        return recursStr(str.substring(1)) + str.charAt(0);
    }
    
    public static String strrev(String str){
        StringBuilder st = new StringBuilder();
        for(int i=str.length()-1 ; i>=0;i--){
            st.append(str.charAt(i));
        }
        return st.toString();
    }
    public static void main(String args[]){
        System.out.println("Enter String to reverse:");
        Scanner s= new Scanner(System.in);
        String str = s.nextLine();
        ReverStr r = new ReverStr();
        String ans = strrev(str);
        System.out.println("String Reverse without Recursion: " + ans);
        String sol = r.recursStr(str);
        System.out.println("Reversed string with Recursio:" + sol );
    }
}
