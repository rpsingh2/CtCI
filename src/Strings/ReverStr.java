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
    public static void main(String args[]){
        System.out.println("Enter String to reverse:");
        Scanner s= new Scanner(System.in);
        ReverStr r = new ReverStr();
        String sol = r.recursStr(s.nextLine());
        System.out.println("Reversed string is:" + sol );
    }
}
